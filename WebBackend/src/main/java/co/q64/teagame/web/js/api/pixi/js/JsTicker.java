package co.q64.teagame.web.js.api.pixi.js;

import org.teavm.jso.JSMethod;
import org.teavm.jso.JSObject;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.js.spi.pixi.JsTickable;

@API
public interface JsTicker extends JSObject {
	public @JSMethod void start();

	public @JSMethod void stop();

	public @JSMethod void add(JsTickable tickable);
}