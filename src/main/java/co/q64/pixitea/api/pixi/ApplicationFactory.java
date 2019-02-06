package co.q64.pixitea.api.pixi;

import co.q64.pixitea.api.annotation.API;
import co.q64.pixitea.api.pixi.js.Application;
import co.q64.pixitea.spi.pixi.js.ApplicationOptions;

@API
public interface ApplicationFactory {
	public Application create(ApplicationOptions options);
}
