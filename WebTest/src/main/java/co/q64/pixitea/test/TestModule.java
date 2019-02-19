package co.q64.pixitea.test;

import co.q64.teagame.spi.Game;
import co.q64.teagame.web.js.spi.pixi.JsTickable;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;

@Module
public interface TestModule {
	// @formatter:off
	@Binds Game bindGame(TestGame game);
	
	@Binds @IntoSet JsTickable bindTestTickable(TestTickable testTickable);
	
	// @formatter:on
}
