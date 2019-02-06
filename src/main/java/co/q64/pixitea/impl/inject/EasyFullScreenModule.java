package co.q64.pixitea.impl.inject;

import org.teavm.jso.browser.Window;

import co.q64.pixitea.api.pixi.ApplicationOptionsBuilder;
import co.q64.pixitea.impl.inject.internal.EasyModuleComponent;
import co.q64.pixitea.spi.pixi.js.ApplicationOptions;
import dagger.Module;
import dagger.Provides;

@Module(includes = DefaultModule.class)
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
