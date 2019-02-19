package co.q64.teagame.web.js.api.pixi;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.js.spi.pixi.JsGraphics;

@API
public interface JsGraphicsFactory {
	public JsGraphics create();
}
