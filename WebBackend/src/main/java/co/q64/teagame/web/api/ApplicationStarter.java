package co.q64.teagame.web.api;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.api.pixi.js.Application;

@API
public interface ApplicationStarter {
	public void start(Application application);
	
	public Application getApplication();
}
