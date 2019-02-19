package co.q64.teagame.web.js.api.pixi.js;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.browser.Window;
import org.teavm.jso.dom.html.HTMLCanvasElement;
import org.teavm.jso.dom.html.HTMLElement;

import co.q64.teagame.api.annotation.API;
import co.q64.teagame.web.js.api.pixi.JsStage;
import co.q64.teagame.web.js.spi.pixi.JsRectangle;

/**
 * http://pixijs.download/dev/docs/PIXI.Application.html
 */
@API
public interface JsApplication extends JSObject {

	public @JSProperty HTMLCanvasElement getView();

	public @JSProperty JsLoader getLoader();

	public @JSProperty JsRenderer getRenderer();

	public @JSProperty JsRectangle getScreen();

	public @JSProperty JsStage getStage();

	public @JSProperty JsTicker getTicker();

	public @JSProperty void setResizeTo(Window window);

	public @JSProperty void setResizeTo(HTMLElement element);

	public void render();

	public void start();

	public void stop();
}
