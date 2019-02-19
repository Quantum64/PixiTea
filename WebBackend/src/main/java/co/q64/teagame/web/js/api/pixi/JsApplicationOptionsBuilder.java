package co.q64.teagame.web.js.api.pixi;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.js.spi.pixi.JsApplicationOptions;

@API
public interface JsApplicationOptionsBuilder {
	JsApplicationOptions build();
	
	JsApplicationOptionsBuilder withWidth(int width);
	
	JsApplicationOptionsBuilder withHeight(int height);
	
	JsApplicationOptionsBuilder transparent(boolean transparent);
}
