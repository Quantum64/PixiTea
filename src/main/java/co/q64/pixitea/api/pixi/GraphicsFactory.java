package co.q64.pixitea.api.pixi;

import co.q64.pixitea.api.annotation.API;
import co.q64.pixitea.spi.pixi.js.Graphics;

@API
public interface GraphicsFactory {
	public Graphics create();
}
