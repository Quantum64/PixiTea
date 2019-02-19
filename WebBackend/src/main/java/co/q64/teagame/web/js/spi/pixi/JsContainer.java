package co.q64.teagame.web.js.spi.pixi;

import org.teavm.jso.JSMethod;

import co.q64.teagame.api.annotation.SPI;

@SPI
public interface JsContainer extends JsDisplayObject {

	@JSMethod
	public JsDisplayObject addChild(JsDisplayObject object);
}
