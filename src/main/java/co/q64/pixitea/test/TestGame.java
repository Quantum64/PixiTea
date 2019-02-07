package co.q64.pixitea.test;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.pixitea.api.pixi.GraphicsFactory;
import co.q64.pixitea.api.pixi.Stage;
import co.q64.pixitea.spi.Game;
import co.q64.pixitea.spi.pixi.js.Graphics;
import lombok.Getter;

@Singleton
public class TestGame implements Game {
	protected @Inject Stage stage;
	protected @Inject GraphicsFactory graphicsFactory;

	private @Getter Graphics testGraphics;

	protected @Inject TestGame() {}

	@Override
	public void preInitialization() {
		testGraphics = graphicsFactory.create();
		testGraphics.beginFill(0xff0000);
		testGraphics.drawRect(0, 0, 100, 100);
		testGraphics.endFill();
		stage.addChild(testGraphics);
	}

	@Override
	public void initialization() {

	}
}
