package co.q64.pixitea.api.pixi;

import co.q64.pixitea.api.annotation.API;
import co.q64.pixitea.spi.pixi.js.Container;

@API
public interface ContainerFactory {
	public Container create();
}
