package co.q64.pixitea.spi.pixi.js;

import org.teavm.jso.JSFunctor;

@JSFunctor
@FunctionalInterface
public interface Tickable {
	public void tick(double delta);
}
