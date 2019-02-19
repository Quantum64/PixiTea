package co.q64.teagame.web.impl;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.teagame.web.js.spi.pixi.JsTickable;

@Singleton
public class InternalTicker implements JsTickable {
	protected @Inject InternalTicker() {}

	@Override
	public void tick(double delta) {
		// Do nothing?
	}
}
