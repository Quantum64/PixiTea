package co.q64.pixitea.test;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.teagame.spi.Game;
import co.q64.teagame.web.api.pixi.DisplayGroupFactory;
import co.q64.teagame.web.api.pixi.GraphicsFactory;
import co.q64.teagame.web.api.pixi.Stage;
import co.q64.teagame.web.spi.pixi.js.DisplayGroup;
import co.q64.teagame.web.spi.pixi.js.Graphics;
import lombok.Getter;

@Singleton
public class TestGame implements Game {
	protected @Inject Stage stage;
	protected @Inject GraphicsFactory graphicsFactory;
	protected @Inject DisplayGroupFactory layerFactory;

	private @Getter Graphics testGraphics;

	protected @Inject TestGame() {}

	@Override
	public void preInitialization() {
		DisplayGroup layer0 = layerFactory.create(4);
		DisplayGroup layer1 = layerFactory.create(0);

		testGraphics = graphicsFactory.create();
		testGraphics.beginFill(0xff0000);
		testGraphics.drawRect(0, 0, 100, 100);
		testGraphics.endFill();

		Graphics g = graphicsFactory.create();
		g.beginFill(0x00ff00);
		g.drawRect(0, 0, 150, 50);
		g.endFill();

		stage.addChild(g);
		stage.addChild(testGraphics);
	}

	@Override
	public void initialization() {

	}
}
