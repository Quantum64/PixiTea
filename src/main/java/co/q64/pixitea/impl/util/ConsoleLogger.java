package co.q64.pixitea.impl.util;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.pixitea.api.Logger;

@Singleton
public class ConsoleLogger implements Logger {
	
	protected @Inject ConsoleLogger() {}
	
	@Override
	public void log(String message) {
		consoleLog(message);
	}

	@JSBody(params = { "message" }, script = "console.log(message)")
	private static native void consoleLog(String message);
}
