package co.q64.teagame.spi;

public interface Graphics extends Container {
	public Graphics beginFill(int color);

	public Graphics beginFill(int color, double alpha);

	public Graphics endFill();

	public Graphics drawRect(double x, double y, double width, double height);
}
