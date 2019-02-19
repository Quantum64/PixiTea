package co.q64.teagame.web.impl;

import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.JSBody;
import org.teavm.jso.dom.html.HTMLCanvasElement;

import co.q64.teagame.api.util.Logger;
import co.q64.teagame.web.api.ApplicationStarter;
import co.q64.teagame.web.js.api.pixi.JsApplicationFactory;
import co.q64.teagame.web.js.api.pixi.js.JsApplication;
import co.q64.teagame.web.js.spi.pixi.JsApplicationOptions;

@Singleton
public class ApplicationStarterImpl implements ApplicationStarter {
	protected @Inject Logger logger;
	protected @Inject Optional<JsApplicationOptions> options;
	protected @Inject JsApplicationFactory applicationFactory;

	private JsApplication application;

	protected @Inject ApplicationStarterImpl() {}

	protected @Inject void init() {
		if (options.isPresent()) {
			start(applicationFactory.create(options.get()));
			logger.log("Created with default width and height (" + options.get().getWidth() + "x" + options.get().getHeight() + ")");
		}
	}

	@Override
	public void start(JsApplication application) {
		if (this.application != null) {
			throw new RuntimeException("Cannot start application multiple times.");
		}
		this.application = application;
		injectContext(application.getView());
	}

	@Override
	public JsApplication getApplication() {
		if (application == null) {
			throw new RuntimeException("Application was provided before starting. Move post-initialization code into a Lazy<> injector or re-inject.");
		}
		return application;
	}

	@JSBody(params = { "view" }, script = "document.body.appendChild(view);")
	private static native void injectContext(HTMLCanvasElement view);
}
