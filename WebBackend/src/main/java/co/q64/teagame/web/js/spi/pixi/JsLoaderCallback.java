package co.q64.teagame.web.js.spi.pixi;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import co.q64.teagame.api.annotation.SPI;
import co.q64.teagame.api.annotation.SPI.Reason;
import co.q64.teagame.web.js.api.pixi.js.JsLoader;

@SPI(Reason.IMPLEMENT)
@JSFunctor
@FunctionalInterface
public interface JsLoaderCallback extends JSObject {
	public void callback(JsLoader loader, JsResources resources);
}
