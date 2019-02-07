package co.q64.pixitea.impl;

import java.util.Set;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.pixitea.api.ApplicationLoader;
import co.q64.pixitea.api.pixi.js.Ticker;
import co.q64.pixitea.spi.pixi.js.Tickable;

@Singleton
public class ApplicationLoaderImpl implements ApplicationLoader {
	protected @Inject Ticker ticker;
	protected @Inject Set<Tickable> tickables;

	protected @Inject ApplicationLoaderImpl() {}

	@Override
	public void load() {
		
	}

	private void start() {
		tickables.forEach(ticker::add);
	}
}
