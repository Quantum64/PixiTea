package co.q64.teagame.web.js.impl.pixi;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.teagame.web.js.api.pixi.JsContainerFactory;
import co.q64.teagame.web.js.spi.pixi.JsContainer;

@Singleton
public class JsContainerFactoryImpl implements JsContainerFactory {
	protected @Inject JsContainerFactoryImpl() {}

	@Override
	public JsContainer create() {
		return create0();
	}

	@JSBody(script = "return new PIXI.Container();")
	private static native JsContainer create0();
}
