package co.q64.teagame.web.impl;

import java.util.Optional;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.teagame.spi.Game;
import co.q64.teagame.web.api.ApplicationLoader;
import co.q64.teagame.web.api.pixi.js.Loader;
import co.q64.teagame.web.api.pixi.js.Ticker;
import co.q64.teagame.web.spi.pixi.js.Tickable;

@Singleton
public class ApplicationLoaderImpl implements ApplicationLoader {
	protected @Inject Optional<Game> game;
	protected @Inject Loader loader;
	protected @Inject Ticker ticker;
	protected @Inject Set<Tickable> tickables;

	protected @Inject ApplicationLoaderImpl() {}

	@Override
	public void load() {
		if (!game.isPresent()) {
			throw new RuntimeException("Game must have a binding!");
		}
		game.get().preInitialization();
		loader.load((loader, resources) -> this.start());
	}

	private void start() {
		game.get().initialization();
		for (Tickable tickable : tickables) {
			ticker.add(tickable);
		}
	}
}
