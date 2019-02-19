package co.q64.teagame.web.js.spi.pixi;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import co.q64.teagame.api.annotation.SPI;

@SPI
public interface JsDisplayObject extends JSObject {
	public @JSProperty double getX();

	public @JSProperty double getY();

	public @JSProperty void setX(double x);

	public @JSProperty void setY(double y);
}
