package co.q64.pixitea.test;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.teagame.web.js.spi.pixi.JsTickable;

@Singleton
public class TestTickable implements JsTickable {
	protected @Inject TestGame test;

	protected @Inject TestTickable() {}

	@Override
	public void tick(double delta) {
		test.getTestGraphics().setX(test.getTestGraphics().getX() + 1);
	}
}
