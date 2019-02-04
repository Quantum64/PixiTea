package co.q64.pixitea.test;

import javax.inject.Singleton;

import co.q64.pixitea.PixiTea;
import co.q64.pixitea.inject.DefaultModule;
import dagger.Component;

@Singleton
@Component(modules = { DefaultModule.class })
public interface TestComponent {
	public PixiTea getPixiTea();
}
