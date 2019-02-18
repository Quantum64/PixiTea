package co.q64.teagame.web.impl.pixi;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.teagame.web.api.pixi.DisplayGroupFactory;
import co.q64.teagame.web.spi.pixi.js.DisplayGroup;

@Singleton
public class DisplayGroupFactoryImpl implements DisplayGroupFactory {
	protected @Inject DisplayGroupFactoryImpl() {}

	@Override
	public DisplayGroup create(int index) {
		return create0(index);
	}

	@JSBody(params = { "index" }, script = "return new PIXI.display.DisplayGroup(index, false);")
	private static native DisplayGroup create0(int index);
}
