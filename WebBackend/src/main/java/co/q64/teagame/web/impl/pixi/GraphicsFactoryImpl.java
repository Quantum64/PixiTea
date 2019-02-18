package co.q64.teagame.web.impl.pixi;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.teagame.web.api.pixi.GraphicsFactory;
import co.q64.teagame.web.spi.pixi.js.Graphics;

@Singleton
public class GraphicsFactoryImpl implements GraphicsFactory {
	protected @Inject GraphicsFactoryImpl() {}

	@Override
	public Graphics create() {
		return create0();
	}

	@JSBody(script = "return new PIXI.Graphics();")
	private static native Graphics create0();
}
