package co.q64.pixitea.api.pixi;

import co.q64.pixitea.api.annotation.API;
import co.q64.pixitea.spi.pixi.js.Container;

// Basically qualifier for injection since the stage is global but containers are not
@API
public interface Stage extends Container {}
