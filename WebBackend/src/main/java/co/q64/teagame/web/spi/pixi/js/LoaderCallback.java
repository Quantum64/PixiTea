package co.q64.teagame.web.spi.pixi.js;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import co.q64.teagame.api.annotation.SPI;
import co.q64.teagame.api.annotation.SPI.Reason;
import co.q64.teagame.web.api.pixi.js.Loader;

@SPI(Reason.IMPLEMENT)
@JSFunctor
@FunctionalInterface
public interface LoaderCallback extends JSObject {
	public void callback(Loader loader, Resources resources);
}
