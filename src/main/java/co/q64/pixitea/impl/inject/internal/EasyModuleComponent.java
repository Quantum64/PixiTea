package co.q64.pixitea.impl.inject.internal;

import co.q64.pixitea.api.pixi.ApplicationOptionsBuilder;
import co.q64.pixitea.impl.inject.DefaultModule;
import dagger.Component;

@Component(modules = DefaultModule.class)
public interface EasyModuleComponent {
	public ApplicationOptionsBuilder getBuilder();

	public static EasyModuleComponent getComponent() {
		return DaggerEasyModuleComponent.create();
	}
}
