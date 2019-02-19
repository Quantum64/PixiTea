package co.q64.teagame.web.impl.inject;

import org.teavm.jso.browser.Window;

import co.q64.teagame.web.impl.inject.internal.EasyModuleComponent;
import co.q64.teagame.web.js.api.pixi.JsApplicationOptionsBuilder;
import co.q64.teagame.web.js.spi.pixi.JsApplicationOptions;
import dagger.Module;
import dagger.Provides;

@Module(includes = WebModule.class)
public class EasyFullScreenModule {
	private JsApplicationOptionsBuilder options;

	public EasyFullScreenModule() {
		options = EasyModuleComponent.getComponent().getBuilder();
		options.withWidth(Window.current().getInnerWidth()).withHeight(Window.current().getInnerHeight()).transparent(false);
	}

	public @Provides JsApplicationOptions provideOptions() {
		return options.build();
	}
}
