package co.q64.teagame.web.api;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.js.api.pixi.js.JsApplication;

@API
public interface ApplicationStarter {
	public void start(JsApplication application);
	
	public JsApplication getApplication();
}
