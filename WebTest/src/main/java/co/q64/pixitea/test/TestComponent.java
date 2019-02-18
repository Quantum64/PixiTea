package co.q64.pixitea.test;

import javax.inject.Singleton;

import co.q64.teagame.web.impl.inject.EasyFullScreenModule;
import dagger.Component;

@Singleton
@Component(modules = { TestModule.class, EasyFullScreenModule.class })
public interface TestComponent {
	public Test getTest();
}
