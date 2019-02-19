package co.q64.teagame.web.impl;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.q64.teagame.api.Stage;
import co.q64.teagame.web.js.api.pixi.JsStage;

@Singleton
public class StageImpl extends ContainerImpl implements Stage {
	protected @Inject StageImpl(JsStage stage) {
		super(stage);
	}
}
