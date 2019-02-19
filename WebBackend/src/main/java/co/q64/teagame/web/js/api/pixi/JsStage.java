package co.q64.teagame.web.js.api.pixi;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.js.spi.pixi.JsContainer;

// Basically qualifier for injection since the stage is global but containers are not
@API
public interface JsStage extends JsContainer {}
