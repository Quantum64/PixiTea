package co.q64.teagame.web.js.api.pixi;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.js.spi.pixi.JsContainer;

@API
@FunctionalInterface
public interface JsContainerFactory {
	public JsContainer create();
}
