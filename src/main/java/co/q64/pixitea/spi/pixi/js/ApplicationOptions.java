package co.q64.pixitea.spi.pixi.js;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import co.q64.pixitea.api.annotation.SPI;

@SPI
public interface ApplicationOptions extends JSObject {
	@JSProperty
	public int getWidth();
	
	@JSProperty
	public int getHeight();
	
	@JSProperty
	public boolean isTransparent();
}
