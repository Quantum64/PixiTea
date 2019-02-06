package co.q64.pixitea.impl.pixi;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.pixitea.api.pixi.ContainerFactory;
import co.q64.pixitea.spi.pixi.js.Container;

@Singleton
public class ContainerFactoryImpl implements ContainerFactory {
	protected @Inject ContainerFactoryImpl() {}

	@Override
	public Container create() {
		return create0();
	}

	@JSBody(script = "return new PIXI.Container();")
	private static native Container create0();
}
