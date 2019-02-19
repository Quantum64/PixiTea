package co.q64.teagame.web.impl;

import co.q64.teagame.spi.DisplayObject;
import co.q64.teagame.web.js.spi.pixi.JsDisplayObject;
import lombok.Getter;

public class DisplayObjectImpl implements DisplayObject {
	private @Getter JsDisplayObject object;

	protected DisplayObjectImpl(JsDisplayObject object) {
		this.object = object;
	}

	@Override
	public double getX() {
		return object.getX();
	}

	@Override
	public double getY() {
		return object.getY();
	}

	@Override
	public void setX(double x) {
		object.setX(x);
	}

	@Override
	public void setY(double y) {
		object.setY(y);
	}
}
