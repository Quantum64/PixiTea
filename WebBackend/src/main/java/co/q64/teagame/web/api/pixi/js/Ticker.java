package co.q64.teagame.web.api.pixi.js;

import org.teavm.jso.JSMethod;
import org.teavm.jso.JSObject;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.spi.pixi.js.Tickable;

@API
public interface Ticker extends JSObject {
	public @JSMethod void start();

	public @JSMethod void stop();

	public @JSMethod void add(Tickable tickable);
}