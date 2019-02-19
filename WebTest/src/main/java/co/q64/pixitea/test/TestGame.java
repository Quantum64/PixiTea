package co.q64.pixitea.test;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.teagame.api.Stage;
import co.q64.teagame.spi.Game;
import co.q64.teagame.spi.Graphics;
import co.q64.teagame.web.api.GraphicsFactory;
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
