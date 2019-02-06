package co.q64.pixitea.api.pixi;

import co.q64.pixitea.api.annotation.API;
import co.q64.pixitea.spi.pixi.js.ApplicationOptions;

@API
public interface ApplicationOptionsBuilder {
	ApplicationOptions build();
	
	ApplicationOptionsBuilder withWidth(int width);
	
	ApplicationOptionsBuilder withHeight(int height);
	
	ApplicationOptionsBuilder transparent(boolean transparent);
}
