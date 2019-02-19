package co.q64.teagame.spi;

import co.q64.teagame.api.annotation.SPI;

@SPI
public interface DisplayObject {
	public double getX();

	public double getY();

	public void setX(double x);

	public void setY(double y);
}
