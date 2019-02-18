package co.q64.teagame.web.impl.inject.internal;

import co.q64.pixitea.impl.inject.internal.DaggerEasyModuleComponent;
import co.q64.teagame.web.api.pixi.ApplicationOptionsBuilder;
import co.q64.teagame.web.impl.inject.WebModule;
import dagger.Component;

@Component(modules = WebModule.class)
public interface EasyModuleComponent {
	public ApplicationOptionsBuilder getBuilder();

	public static EasyModuleComponent getComponent() {
		return DaggerEasyModuleComponent.create();
	}
}
