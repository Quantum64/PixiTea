package co.q64.teagame.web.spi.pixi.js;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
@FunctionalInterface
public interface Tickable extends JSObject {
	public void tick(double delta);
}