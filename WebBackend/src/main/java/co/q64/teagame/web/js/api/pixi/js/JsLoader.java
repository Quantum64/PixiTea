package co.q64.teagame.web.js.api.pixi.js;

import org.teavm.jso.JSMethod;
import org.teavm.jso.JSObject;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.js.spi.pixi.JsLoaderCallback;

@API
public interface JsLoader extends JSObject {
	public @JSMethod void add(String name, String path);

	public @JSMethod void load(JsLoaderCallback callback);
}
