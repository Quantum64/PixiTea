package co.q64.teagame.web.js.impl.pixi;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.teagame.web.js.api.pixi.JsPIXIFactory;
import co.q64.teagame.web.js.api.pixi.js.JsPIXI;

@Singleton
public class JsPIXIFactoryImpl implements JsPIXIFactory {
	protected @Inject JsPIXIFactoryImpl() {}

	@Override
	public JsPIXI create() {
		return create0();
	}

	@JSBody(script = "return PIXI;")
	protected static native JsPIXI create0();
}
