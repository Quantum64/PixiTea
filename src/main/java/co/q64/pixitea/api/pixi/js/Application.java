package co.q64.pixitea.api.pixi.js;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.browser.Window;
import org.teavm.jso.dom.html.HTMLCanvasElement;
import org.teavm.jso.dom.html.HTMLElement;

import co.q64.pixitea.api.annotation.API;
import co.q64.pixitea.api.pixi.Stage;
import co.q64.pixitea.spi.pixi.js.Rectangle;

/**
 * http://pixijs.download/dev/docs/PIXI.Application.html
 */
@API
public interface Application extends JSObject {

	public @JSProperty HTMLCanvasElement getView();

	public @JSProperty Loader getLoader();

	public @JSProperty Renderer getRenderer();

	public @JSProperty Rectangle getScreen();

	public @JSProperty Stage getStage();

	public @JSProperty Ticker getTicker();

	public @JSProperty void setResizeTo(Window window);

	public @JSProperty void setResizeTo(HTMLElement element);

	public void render();

	public void start();

	public void stop();
}
