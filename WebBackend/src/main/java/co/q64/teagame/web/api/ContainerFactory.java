package co.q64.teagame.web.api;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.spi.Container;

@API
public interface ContainerFactory {
	public Container create();
}
