package co.q64.pixitea.test;

import co.q64.pixitea.spi.Game;
import co.q64.pixitea.spi.pixi.js.Tickable;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;

@Module
public interface TestModule {
	// @formatter:off
	@Binds Game bindGame(TestGame game);
	
	@Binds @IntoSet Tickable bindTestTickable(TestTickable testTickable);
	
	// @formatter:on
}
