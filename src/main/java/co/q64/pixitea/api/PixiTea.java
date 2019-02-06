package co.q64.pixitea.api;

import co.q64.pixitea.api.annotation.API;
import co.q64.pixitea.api.pixi.js.Application;

@API
public interface PixiTea {
	public void start(Application application);
	
	public Application getApplication();
}
