package co.q64.teagame.web.impl.pixi;

import javax.inject.Inject;

import org.teavm.jso.JSBody;

import co.q64.teagame.web.api.pixi.ApplicationOptionsBuilder;
import co.q64.teagame.web.spi.pixi.js.ApplicationOptions;

public class ApplicationOptionsBuilderImpl implements ApplicationOptionsBuilder {
	private int width, height;
	private boolean transparent;

	protected @Inject ApplicationOptionsBuilderImpl() {}

	@Override
	public ApplicationOptions build() {
		return build0(width, height, transparent);
	}

	@Override
	public ApplicationOptionsBuilder withWidth(int width) {
		this.width = width;
		return this;
	}

	@Override
	public ApplicationOptionsBuilder withHeight(int height) {
		this.height = height;
		return this;
	}

	@Override
	public ApplicationOptionsBuilder transparent(boolean transparent) {
		this.transparent = transparent;
		return this;
	}

	@JSBody(params = { "w", "h", "t" }, script = "return {width: w, height: h, transparent: t};")
	private static native ApplicationOptions build0(int width, int height, boolean transparent);
}
