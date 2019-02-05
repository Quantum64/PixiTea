package co.q64.pixitea;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.pixitea.api.Logger;

@Singleton
public class PixiTea {
	protected @Inject Logger logger;
	
	protected @Inject PixiTea() {}

	public void loadScripts() {
		logger.log("Loading scripts...");
	}
}
