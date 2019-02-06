package co.q64.pixitea.spi.pixi.js;

import org.teavm.jso.JSMethod;

import co.q64.pixitea.api.annotation.SPI;

@SPI
public interface Container extends DisplayObject {

	@JSMethod
	public DisplayObject addChild(DisplayObject object);
}
