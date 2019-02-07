package co.q64.pixitea.impl.inject;

import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.pixitea.api.ApplicationLoader;
import co.q64.pixitea.api.ApplicationStarter;
import co.q64.pixitea.api.pixi.ApplicationFactory;
import co.q64.pixitea.api.pixi.ApplicationOptionsBuilder;
import co.q64.pixitea.api.pixi.ContainerFactory;
import co.q64.pixitea.api.pixi.GraphicsFactory;
import co.q64.pixitea.api.pixi.Stage;
import co.q64.pixitea.api.pixi.js.Application;
import co.q64.pixitea.api.pixi.js.PIXI;
import co.q64.pixitea.api.util.Logger;
import co.q64.pixitea.impl.ApplicationLoaderImpl;
import co.q64.pixitea.impl.ApplicationStarterImpl;
import co.q64.pixitea.impl.InternalTicker;
import co.q64.pixitea.impl.pixi.ApplicationFactoryImpl;
import co.q64.pixitea.impl.pixi.ApplicationOptionsBuilderImpl;
import co.q64.pixitea.impl.pixi.ContainerFactoryImpl;
import co.q64.pixitea.impl.pixi.GraphicsFactoryImpl;
import co.q64.pixitea.impl.util.ConsoleLogger;
import co.q64.pixitea.spi.pixi.js.ApplicationOptions;
import co.q64.pixitea.spi.pixi.js.Tickable;
import dagger.Binds;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public interface DefaultModule {

	// @formatter:off
	@Binds Logger bindLogger(ConsoleLogger logger);
	@Binds ApplicationFactory bindApplicationFactory(ApplicationFactoryImpl applicationFactory);
	@Binds ApplicationOptionsBuilder bindApplicationOptionsBuilder(ApplicationOptionsBuilderImpl applicationOptionsBuilder);
	@Binds ContainerFactory bindContainerFactory(ContainerFactoryImpl containerFactory);
	@Binds GraphicsFactory bindGraphicsFactory(GraphicsFactoryImpl graphicsFactory);
	@Binds ApplicationStarter bindApplicationStarter(ApplicationStarterImpl applicationStarter);
	@Binds ApplicationLoader bindApplicationLoader(ApplicationLoaderImpl applicationLoader);
	
	@Binds @IntoSet Tickable bindInternalTicker(InternalTicker internalTicker);
	
	@BindsOptionalOf ApplicationOptions bindApplicationOptions();
	
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

	public static final class JsPIXIProviders { // ???
		private JsPIXIProviders() {}

		@JSBody(script = "return PIXI;")
		protected static native PIXI providePIXI0();
	}
}
