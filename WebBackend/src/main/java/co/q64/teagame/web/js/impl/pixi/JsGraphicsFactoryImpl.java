package co.q64.teagame.web.js.impl.pixi;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.teagame.web.js.api.pixi.JsGraphicsFactory;
import co.q64.teagame.web.js.spi.pixi.JsGraphics;

@Singleton
public class JsGraphicsFactoryImpl implements JsGraphicsFactory {
	protected @Inject JsGraphicsFactoryImpl() {}

	@Override
	public JsGraphics create() {
		return create0();
	}

	@JSBody(script = "return new PIXI.Graphics();")
	private static native JsGraphics create0();
}
