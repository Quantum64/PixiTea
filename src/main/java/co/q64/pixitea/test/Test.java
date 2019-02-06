package co.q64.pixitea.test;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.pixitea.api.pixi.GraphicsFactory;
import co.q64.pixitea.api.pixi.Stage;
import co.q64.pixitea.spi.pixi.js.Graphics;

@Singleton
public class Test {
	protected @Inject Stage stage;
	protected @Inject GraphicsFactory graphicsFactory;

	protected @Inject Test() {}

	protected @Inject void start() {
		Graphics graphics = graphicsFactory.create();
		graphics.beginFill(0xff0000);
		graphics.drawRect(0, 0, 100, 100);
		graphics.endFill();
		stage.addChild(graphics);
	}

	public static void main(String[] args) {
		TestComponent component = DaggerTestComponent.create();
		component.getTest();
	}
}
