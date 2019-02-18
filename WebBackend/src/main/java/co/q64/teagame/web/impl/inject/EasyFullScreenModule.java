package co.q64.teagame.web.impl.inject;

import org.teavm.jso.browser.Window;

import co.q64.teagame.web.api.pixi.ApplicationOptionsBuilder;
import co.q64.teagame.web.impl.inject.internal.EasyModuleComponent;
import co.q64.teagame.web.spi.pixi.js.ApplicationOptions;
import dagger.Module;
import dagger.Provides;

@Module(includes = WebModule.class)
public class EasyFullScreenModule {
	private ApplicationOptionsBuilder options;

	public EasyFullScreenModule() {
		options = EasyModuleComponent.getComponent().getBuilder();
		options.withWidth(Window.current().getInnerWidth()).withHeight(Window.current().getInnerHeight()).transparent(false);
	}

	public @Provides ApplicationOptions provideOptions() {
		return options.build();
	}
}
