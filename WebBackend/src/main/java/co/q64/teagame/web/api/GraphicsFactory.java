package co.q64.teagame.web.api;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.spi.Graphics;

@API
public interface GraphicsFactory {
	public Graphics create();
}
