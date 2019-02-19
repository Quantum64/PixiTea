package co.q64.teagame.web.js.api.pixi;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.js.api.pixi.js.JsApplication;
import co.q64.teagame.web.js.spi.pixi.JsApplicationOptions;

@API
public interface JsApplicationFactory {
	public JsApplication create(JsApplicationOptions options);
}
