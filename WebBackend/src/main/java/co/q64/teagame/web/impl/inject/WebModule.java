package co.q64.teagame.web.impl.inject;

import javax.inject.Singleton;

import co.q64.teagame.api.Stage;
import co.q64.teagame.api.inject.DefaultModule;
import co.q64.teagame.api.util.Logger;
import co.q64.teagame.spi.Game;
import co.q64.teagame.web.api.ApplicationLoader;
import co.q64.teagame.web.api.ApplicationStarter;
import co.q64.teagame.web.api.GraphicsFactory;
import co.q64.teagame.web.impl.ApplicationLoaderImpl;
import co.q64.teagame.web.impl.ApplicationStarterImpl;
import co.q64.teagame.web.impl.GraphicsImplFactory;
import co.q64.teagame.web.impl.InternalTicker;
import co.q64.teagame.web.impl.StageImpl;
import co.q64.teagame.web.impl.util.ConsoleLogger;
import co.q64.teagame.web.js.api.pixi.JsApplicationFactory;
import co.q64.teagame.web.js.api.pixi.JsApplicationOptionsBuilder;
import co.q64.teagame.web.js.api.pixi.JsContainerFactory;
import co.q64.teagame.web.js.api.pixi.JsGraphicsFactory;
import co.q64.teagame.web.js.api.pixi.JsPIXIFactory;
import co.q64.teagame.web.js.api.pixi.JsStage;
import co.q64.teagame.web.js.api.pixi.js.JsApplication;
import co.q64.teagame.web.js.api.pixi.js.JsLoader;
import co.q64.teagame.web.js.api.pixi.js.JsPIXI;
import co.q64.teagame.web.js.api.pixi.js.JsTicker;
import co.q64.teagame.web.js.impl.pixi.JsApplicationFactoryImpl;
import co.q64.teagame.web.js.impl.pixi.JsApplicationOptionsBuilderImpl;
import co.q64.teagame.web.js.impl.pixi.JsContainerFactoryImpl;
import co.q64.teagame.web.js.impl.pixi.JsGraphicsFactoryImpl;
import co.q64.teagame.web.js.impl.pixi.JsPIXIFactoryImpl;
import co.q64.teagame.web.js.spi.pixi.JsApplicationOptions;
import co.q64.teagame.web.js.spi.pixi.JsContainer;
import co.q64.teagame.web.js.spi.pixi.JsGraphics;
import co.q64.teagame.web.js.spi.pixi.JsTickable;
import dagger.Binds;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module(includes = { DefaultModule.class })
public interface WebModule {

	// @formatter:off
	@Binds Logger bindLogger(ConsoleLogger logger);
	@Binds JsApplicationFactory bindApplicationFactory(JsApplicationFactoryImpl applicationFactory);
	@Binds JsApplicationOptionsBuilder bindApplicationOptionsBuilder(JsApplicationOptionsBuilderImpl applicationOptionsBuilder);
	@Binds JsContainerFactory bindContainerFactory(JsContainerFactoryImpl containerFactory);
	@Binds JsGraphicsFactory bindJsGraphicsFactory(JsGraphicsFactoryImpl jsGraphicsFactory);
	@Binds ApplicationStarter bindApplicationStarter(ApplicationStarterImpl applicationStarter);
	@Binds ApplicationLoader bindApplicationLoader(ApplicationLoaderImpl applicationLoader);
	@Binds GraphicsFactory bindGraphicsFactory(GraphicsImplFactory graphicsFactory);
	@Binds JsPIXIFactory bindJsPIXIFactory(JsPIXIFactoryImpl jsPIXIFactory);
	@Binds Stage bindStage(StageImpl stage);
	
	@Binds @IntoSet JsTickable bindInternalTicker(InternalTicker internalTicker);
	
	@BindsOptionalOf JsApplicationOptions bindApplicationOptions();
	@BindsOptionalOf Game bindGame();
	
	// @formatter:on

	static @Provides @Singleton JsPIXI providePIXI(JsPIXIFactory factory) {
		return factory.create();
	}

	static @Provides JsApplication provideApplication(ApplicationStarter pixi) {
		return pixi.getApplication();
	}

	static @Provides JsStage provideStage(JsApplication application) {
		return application.getStage();
	}

	static @Provides JsLoader provideLoader(JsApplication application) {
		return application.getLoader();
	}

	static @Provides JsTicker provideTicker(JsApplication application) {
		return application.getTicker();
	}

	static @Provides JsGraphics provideGraphics(JsGraphicsFactory graphicsFactory) {
		return graphicsFactory.create();
	}

	static @Provides JsContainer provideContainer(JsContainerFactory containerFactory) {
		return containerFactory.create();
	}
}
