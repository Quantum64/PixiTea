package co.q64.teagame.web.js.impl.pixi;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.teagame.web.js.api.pixi.JsApplicationFactory;
import co.q64.teagame.web.js.api.pixi.js.JsApplication;
import co.q64.teagame.web.js.spi.pixi.JsApplicationOptions;

@Singleton
public class JsApplicationFactoryImpl implements JsApplicationFactory {
	protected @Inject JsApplicationFactoryImpl() {}

	@Override
	public JsApplication create(JsApplicationOptions options) {
		return create0(options);
	}

	@JSBody(params = { "options" }, script = "return new PIXI.Application(options);")
	private static native JsApplication create0(JsApplicationOptions options);
}
