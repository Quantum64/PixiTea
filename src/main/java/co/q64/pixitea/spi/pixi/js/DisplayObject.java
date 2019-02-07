package co.q64.pixitea.spi.pixi.js;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import co.q64.pixitea.api.annotation.SPI;

@SPI
public interface DisplayObject extends JSObject {
	public @JSProperty double getX();

	public @JSProperty double getY();

	public @JSProperty void setX(double x);

	public @JSProperty void setY(double y);
}
