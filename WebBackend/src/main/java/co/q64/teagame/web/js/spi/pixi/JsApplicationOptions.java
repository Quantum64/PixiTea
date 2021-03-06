package co.q64.teagame.web.js.spi.pixi;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import co.q64.teagame.api.annotation.SPI;

@SPI
public interface JsApplicationOptions extends JSObject {
	public @JSProperty int getWidth();

	public @JSProperty int getHeight();

	public @JSProperty boolean isTransparent();
}
