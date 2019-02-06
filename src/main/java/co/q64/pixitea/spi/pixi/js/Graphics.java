package co.q64.pixitea.spi.pixi.js;

import org.teavm.jso.JSMethod;

import co.q64.pixitea.api.annotation.SPI;

@SPI
public interface Graphics extends Container {
	
	@JSMethod
	public Graphics beginFill(int color);
	
	@JSMethod
	public Graphics beginFill(int color, double alpha);
	
	@JSMethod
	public Graphics endFill();
	
	@JSMethod
	public Graphics drawRect(double x, double y, double width, double height);
}
