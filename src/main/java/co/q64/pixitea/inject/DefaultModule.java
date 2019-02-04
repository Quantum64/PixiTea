package co.q64.pixitea.inject;

import co.q64.pixitea.api.Logger;
import co.q64.pixitea.impl.util.ConsoleLogger;
import dagger.Binds;
import dagger.Module;

@Module
public interface DefaultModule {
	
	public @Binds Logger bindLogger(ConsoleLogger logger);
}
