package co.q64.pixitea.impl;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.pixitea.spi.pixi.js.Tickable;

@Singleton
public class InternalTicker implements Tickable {
	protected @Inject InternalTicker() {}

	@Override
	public void tick(double delta) {
		// Do nothing?
	}
}
