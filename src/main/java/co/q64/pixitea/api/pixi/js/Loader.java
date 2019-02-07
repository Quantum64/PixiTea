package co.q64.pixitea.api.pixi.js;

import org.teavm.jso.JSMethod;
import org.teavm.jso.JSObject;

import co.q64.pixitea.api.annotation.API;

@API
public interface Loader extends JSObject {

	@JSMethod
	public void add(String name, String path);
}
