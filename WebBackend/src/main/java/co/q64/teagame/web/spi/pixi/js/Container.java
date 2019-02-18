package co.q64.teagame.web.spi.pixi.js;

import org.teavm.jso.JSMethod;

import co.q64.teagame.api.annotation.SPI;

@SPI
public interface Container extends DisplayObject {

	@JSMethod
	public DisplayObject addChild(DisplayObject object);
}
