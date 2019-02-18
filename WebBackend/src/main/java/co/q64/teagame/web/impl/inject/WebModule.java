package co.q64.teagame.web.impl.inject;

import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.teagame.api.inject.DefaultModule;
import co.q64.teagame.api.util.Logger;
import co.q64.teagame.spi.Game;
import co.q64.teagame.web.api.ApplicationLoader;
import co.q64.teagame.web.api.ApplicationStarter;
import co.q64.teagame.web.api.pixi.ApplicationFactory;
import co.q64.teagame.web.api.pixi.ApplicationOptionsBuilder;
import co.q64.teagame.web.api.pixi.ContainerFactory;
import co.q64.teagame.web.api.pixi.DisplayGroupFactory;
import co.q64.teagame.web.api.pixi.GraphicsFactory;
import co.q64.teagame.web.api.pixi.Stage;
import co.q64.teagame.web.api.pixi.js.Application;
import co.q64.teagame.web.api.pixi.js.Loader;
import co.q64.teagame.web.api.pixi.js.PIXI;
import co.q64.teagame.web.api.pixi.js.Ticker;
import co.q64.teagame.web.impl.ApplicationLoaderImpl;
import co.q64.teagame.web.impl.ApplicationStarterImpl;
import co.q64.teagame.web.impl.InternalTicker;
import co.q64.teagame.web.impl.pixi.ApplicationFactoryImpl;
import co.q64.teagame.web.impl.pixi.ApplicationOptionsBuilderImpl;
import co.q64.teagame.web.impl.pixi.ContainerFactoryImpl;
import co.q64.teagame.web.impl.pixi.DisplayGroupFactoryImpl;
import co.q64.teagame.web.impl.pixi.GraphicsFactoryImpl;
import co.q64.teagame.web.impl.util.ConsoleLogger;
import co.q64.teagame.web.spi.pixi.js.ApplicationOptions;
import co.q64.teagame.web.spi.pixi.js.Tickable;
import dagger.Binds;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module(includes = { DefaultModule.class })
public interface WebModule {

	// @formatter:off
	@Binds Logger bindLogger(ConsoleLogger logger);
	@Binds ApplicationFactory bindApplicationFactory(ApplicationFactoryImpl applicationFactory);
	@Binds ApplicationOptionsBuilder bindApplicationOptionsBuilder(ApplicationOptionsBuilderImpl applicationOptionsBuilder);
	@Binds ContainerFactory bindContainerFactory(ContainerFactoryImpl containerFactory);
	@Binds GraphicsFactory bindGraphicsFactory(GraphicsFactoryImpl graphicsFactory);
	@Binds ApplicationStarter bindApplicationStarter(ApplicationStarterImpl applicationStarter);
	@Binds ApplicationLoader bindApplicationLoader(ApplicationLoaderImpl applicationLoader);
	@Binds DisplayGroupFactory bindDisplayLayerFactory(DisplayGroupFactoryImpl displayLayerFactory);
	
	@Binds @IntoSet Tickable bindInternalTicker(InternalTicker internalTicker);
	
	@BindsOptionalOf ApplicationOptions bindApplicationOptions();
	@BindsOptionalOf Game bindGame();
	
	// @formatter:on

	public static @Provides @Singleton PIXI providePIXI() {
		return JsPIXIProviders.providePIXI0();
	}

	public static @Provides Application provideApplication(ApplicationStarter pixi) {
		return pixi.getApplication();
	}

	public static @Provides Stage provideStage(Application application) {
		return application.getStage();
	}

	public static @Provides Loader provideLoader(Application application) {
		return application.getLoader();
	}

	public static @Provides Ticker provideTicker(Application application) {
		return application.getTicker();
	}

	public static final class JsPIXIProviders { // ???
		private JsPIXIProviders() {}

		@JSBody(script = "return PIXI;")
		protected static native PIXI providePIXI0();
	}
}
