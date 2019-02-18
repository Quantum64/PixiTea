package co.q64.teagame.web.impl;

import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.browser.Window;

import co.q64.teagame.api.Starter;
import co.q64.teagame.api.binders.ApplicationBinders.BaseConstantBinders.Height;
import co.q64.teagame.api.binders.ApplicationBinders.BaseConstantBinders.Transparent;
import co.q64.teagame.api.binders.ApplicationBinders.BaseConstantBinders.Width;
import co.q64.teagame.web.api.ApplicationLoader;
import co.q64.teagame.web.api.ApplicationStarter;
import co.q64.teagame.web.api.pixi.ApplicationFactory;
import co.q64.teagame.web.api.pixi.ApplicationOptionsBuilder;
import co.q64.teagame.web.spi.pixi.js.ApplicationOptions;

@Singleton
public class StarterImpl implements Starter {
	protected @Inject ApplicationOptionsBuilder optionsBuilder;
	protected @Inject ApplicationStarter applicationStarter;
	protected @Inject ApplicationLoader applicationLoader;
	protected @Inject ApplicationFactory applicationFactory;
	protected @Inject @Width Optional<Integer> width;
	protected @Inject @Height Optional<Integer> height;
	protected @Inject @Transparent Optional<Boolean> transparent;

	protected @Inject StarterImpl() {}

	@Override
	public void start() {
		ApplicationOptions options = optionsBuilder.withWidth(width.orElse(Window.current().getInnerWidth())).withHeight(height.orElse(Window.current().getInnerHeight())).transparent(transparent.orElse(false)).build();
		applicationStarter.start(applicationFactory.create(options));
		applicationLoader.load();
	}
}
