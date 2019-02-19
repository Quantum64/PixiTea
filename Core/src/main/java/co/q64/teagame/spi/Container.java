package co.q64.teagame.spi;

import co.q64.teagame.api.annotation.SPI;

@SPI
public interface Container extends DisplayObject {
	public DisplayObject addChild(DisplayObject object);
}
