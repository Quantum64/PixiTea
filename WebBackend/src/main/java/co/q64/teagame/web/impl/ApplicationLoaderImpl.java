package co.q64.teagame.web.impl;

import java.util.Optional;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.teagame.spi.Game;
import co.q64.teagame.web.api.ApplicationLoader;
import co.q64.teagame.web.js.api.pixi.js.JsLoader;
import co.q64.teagame.web.js.api.pixi.js.JsTicker;
import co.q64.teagame.web.js.spi.pixi.JsTickable;

@Singleton
public class ApplicationLoaderImpl implements ApplicationLoader {
	protected @Inject Optional<Game> game;
	protected @Inject JsLoader loader;
	protected @Inject JsTicker ticker;
	protected @Inject Set<JsTickable> tickables;

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
		for (JsTickable tickable : tickables) {
			ticker.add(tickable);
		}
	}
}
