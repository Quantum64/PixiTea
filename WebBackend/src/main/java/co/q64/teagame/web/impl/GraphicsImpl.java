package co.q64.teagame.web.impl;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;

import co.q64.teagame.spi.Graphics;
import co.q64.teagame.web.api.GraphicsFactory;
import co.q64.teagame.web.js.spi.pixi.JsGraphics;

@AutoFactory(implementing = { GraphicsFactory.class })
public class GraphicsImpl extends ContainerImpl implements Graphics {
	private JsGraphics graphics;

	protected GraphicsImpl(@Provided JsGraphics graphics) {
		super(graphics);
		this.graphics = graphics;
	}

	@Override
	public Graphics beginFill(int color) {
		graphics.beginFill(color);
		return this;
	}

	@Override
	public Graphics beginFill(int color, double alpha) {
		graphics.beginFill(color, alpha);
		return this;
	}

	@Override
	public Graphics endFill() {
		graphics.endFill();
		return this;
	}

	@Override
	public Graphics drawRect(double x, double y, double width, double height) {
		graphics.drawRect(x, y, width, height);
		return this;
	}
}
