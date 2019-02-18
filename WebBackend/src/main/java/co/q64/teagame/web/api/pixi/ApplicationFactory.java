package co.q64.teagame.web.api.pixi;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.api.pixi.js.Application;
import co.q64.teagame.web.spi.pixi.js.ApplicationOptions;

@API
public interface ApplicationFactory {
	public Application create(ApplicationOptions options);
}
