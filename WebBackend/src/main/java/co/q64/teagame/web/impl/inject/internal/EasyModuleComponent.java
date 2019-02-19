package co.q64.teagame.web.impl.inject.internal;

import co.q64.teagame.web.impl.inject.WebModule;
import co.q64.teagame.web.js.api.pixi.JsApplicationOptionsBuilder;
import dagger.Component;

@Component(modules = WebModule.class)
public interface EasyModuleComponent {
	public JsApplicationOptionsBuilder getBuilder();

	public static EasyModuleComponent getComponent() {
		return DaggerEasyModuleComponent.create();
	}
}
