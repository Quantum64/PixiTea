package co.q64.teagame.web.api.pixi;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.spi.pixi.js.Container;

// Basically qualifier for injection since the stage is global but containers are not
@API
public interface Stage extends Container {}
