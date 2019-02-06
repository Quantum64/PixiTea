package co.q64.pixitea.impl.inject;

import javax.inject.Singleton;

import org.teavm.jso.JSBody;

import co.q64.pixitea.api.PixiTea;
import co.q64.pixitea.api.pixi.ApplicationFactory;
import co.q64.pixitea.api.pixi.ApplicationOptionsBuilder;
import co.q64.pixitea.api.pixi.ContainerFactory;
import co.q64.pixitea.api.pixi.GraphicsFactory;
import co.q64.pixitea.api.pixi.Stage;
import co.q64.pixitea.api.pixi.js.Application;
import co.q64.pixitea.api.pixi.js.PIXI;
import co.q64.pixitea.api.util.Logger;
import co.q64.pixitea.impl.PixiTeaImpl;
import co.q64.pixitea.impl.pixi.ApplicationFactoryImpl;
import co.q64.pixitea.impl.pixi.ApplicationOptionsBuilderImpl;
import co.q64.pixitea.impl.pixi.ContainerFactoryImpl;
import co.q64.pixitea.impl.pixi.GraphicsFactoryImpl;
import co.q64.pixitea.impl.util.ConsoleLogger;
import co.q64.pixitea.spi.pixi.js.ApplicationOptions;
import dagger.Binds;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;

@Module
public interface DefaultModule {

	// @formatter:off
	@Binds Logger bindLogger(ConsoleLogger logger);
	@Binds ApplicationFactory bindApplicationFactory(ApplicationFactoryImpl applicationFactory);
	@Binds ApplicationOptionsBuilder bindApplicationOptionsBuilder(ApplicationOptionsBuilderImpl applicationOptionsBuilder);
	@Binds ContainerFactory bindContainerFactory(ContainerFactoryImpl containerFactory);
	@Binds GraphicsFactory bindGraphicsFactory(GraphicsFactoryImpl graphicsFactory);
	@Binds PixiTea bindCoreAPI(PixiTeaImpl coreAPI);
	
	@BindsOptionalOf ApplicationOptions bindApplicationOptions();
	
	// @formatter:on

	public static @Provides @Singleton PIXI providePIXI() {
		return JsPIXIProviders.providePIXI0();
	}

	public static @Provides Application provideApplication(PixiTea pixi) {
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
