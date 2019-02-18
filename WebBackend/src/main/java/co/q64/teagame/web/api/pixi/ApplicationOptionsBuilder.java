package co.q64.teagame.web.api.pixi;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.spi.pixi.js.ApplicationOptions;

@API
public interface ApplicationOptionsBuilder {
	ApplicationOptions build();
	
	ApplicationOptionsBuilder withWidth(int width);
	
	ApplicationOptionsBuilder withHeight(int height);
	
	ApplicationOptionsBuilder transparent(boolean transparent);
}
