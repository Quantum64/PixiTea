package co.q64.teagame.web.js.impl.pixi;

import javax.inject.Inject;

import org.teavm.jso.JSBody;

import co.q64.teagame.web.js.api.pixi.JsApplicationOptionsBuilder;
import co.q64.teagame.web.js.spi.pixi.JsApplicationOptions;

public class JsApplicationOptionsBuilderImpl implements JsApplicationOptionsBuilder {
	private int width, height;
	private boolean transparent;

	protected @Inject JsApplicationOptionsBuilderImpl() {}

	@Override
	public JsApplicationOptions build() {
		return build0(width, height, transparent);
	}

	@Override
	public JsApplicationOptionsBuilder withWidth(int width) {
		this.width = width;
		return this;
	}

	@Override
	public JsApplicationOptionsBuilder withHeight(int height) {
		this.height = height;
		return this;
	}

	@Override
	public JsApplicationOptionsBuilder transparent(boolean transparent) {
		this.transparent = transparent;
		return this;
	}

	@JSBody(params = { "w", "h", "t" }, script = "return {width: w, height: h, transparent: t};")
	private static native JsApplicationOptions build0(int width, int height, boolean transparent);
}
