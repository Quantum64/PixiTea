package co.q64.pixitea.impl.pixi;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.pixitea.api.pixi.ApplicationFactory;
import co.q64.pixitea.api.pixi.js.Application;
import co.q64.pixitea.spi.pixi.js.ApplicationOptions;

@Singleton
public class ApplicationFactoryImpl implements ApplicationFactory {
	protected @Inject ApplicationFactoryImpl() {}

	@Override
	public Application create(ApplicationOptions options) {
		return create0(options);
	}

	@JSBody(params = { "options" }, script = "return new PIXI.Application(options);")
	private static native Application create0(ApplicationOptions options);
}
