package co.q64.teagame.web.js.spi.pixi;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
@FunctionalInterface
public interface JsTickable extends JSObject {
	public void tick(double delta);
}
