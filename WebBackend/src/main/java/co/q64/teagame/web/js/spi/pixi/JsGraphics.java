package co.q64.teagame.web.js.spi.pixi;

import org.teavm.jso.JSMethod;

import co.q64.teagame.api.annotation.SPI;

@SPI
public interface JsGraphics extends JsContainer {
	
	@JSMethod
	public JsGraphics beginFill(int color);
	
	@JSMethod
	public JsGraphics beginFill(int color, double alpha);
	
	@JSMethod
	public JsGraphics endFill();
	
	@JSMethod
	public JsGraphics drawRect(double x, double y, double width, double height);
}
