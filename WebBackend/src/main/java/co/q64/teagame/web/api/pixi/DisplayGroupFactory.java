package co.q64.teagame.web.api.pixi;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.spi.pixi.js.DisplayGroup;

@API
@Deprecated
public interface DisplayGroupFactory {
	public DisplayGroup create(int index);
}
