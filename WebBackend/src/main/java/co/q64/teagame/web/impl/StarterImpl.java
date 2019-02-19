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
import co.q64.teagame.web.js.api.pixi.JsApplicationFactory;
import co.q64.teagame.web.js.api.pixi.JsApplicationOptionsBuilder;
import co.q64.teagame.web.js.spi.pixi.JsApplicationOptions;

@Singleton
public class StarterImpl implements Starter {
	protected @Inject JsApplicationOptionsBuilder optionsBuilder;
	protected @Inject ApplicationStarter applicationStarter;
	protected @Inject ApplicationLoader applicationLoader;
	protected @Inject JsApplicationFactory applicationFactory;
	protected @Inject @Width Optional<Integer> width;
	protected @Inject @Height Optional<Integer> height;
	protected @Inject @Transparent Optional<Boolean> transparent;

	protected @Inject StarterImpl() {}

	@Override
	public void start() {
		JsApplicationOptions options = optionsBuilder.withWidth(width.orElse(Window.current().getInnerWidth())).withHeight(height.orElse(Window.current().getInnerHeight())).transparent(transparent.orElse(false)).build();
		applicationStarter.start(applicationFactory.create(options));
		applicationLoader.load();
	}
}
