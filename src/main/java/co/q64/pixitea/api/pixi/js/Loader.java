package co.q64.pixitea.api.pixi.js;

import org.teavm.jso.JSMethod;
import org.teavm.jso.JSObject;

import co.q64.pixitea.api.annotation.API;
import co.q64.pixitea.spi.pixi.js.LoaderCallback;

@API
public interface Loader extends JSObject {
	public @JSMethod void add(String name, String path);

	public @JSMethod void load(LoaderCallback callback);
}
