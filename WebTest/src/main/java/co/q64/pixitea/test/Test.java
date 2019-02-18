package co.q64.pixitea.test;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.teagame.web.api.ApplicationLoader;

@Singleton
public class Test {
	protected @Inject ApplicationLoader loader;

	protected @Inject Test() {}

	private void start() {
		loader.load();
	}

	public static void main(String[] args) {
		TestComponent component = DaggerTestComponent.create();
		component.getTest().start();
	}
}