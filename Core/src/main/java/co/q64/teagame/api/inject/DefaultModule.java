package co.q64.teagame.api.inject;

import java.beans.Transient;

import co.q64.teagame.api.binders.ApplicationBinders.BaseConstantBinders.Height;
import co.q64.teagame.api.binders.ApplicationBinders.BaseConstantBinders.Width;
import dagger.BindsOptionalOf;
import dagger.Module;

@Module
public interface DefaultModule {
	// @formatter:off

	@BindsOptionalOf @Width int width();
	@BindsOptionalOf @Height int height();
	@BindsOptionalOf @Transient boolean transparent();
	
	// @formatter:on
}
