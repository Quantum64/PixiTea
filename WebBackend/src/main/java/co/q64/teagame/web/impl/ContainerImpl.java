package co.q64.teagame.web.impl;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;

import co.q64.teagame.spi.Container;
import co.q64.teagame.spi.DisplayObject;
import co.q64.teagame.web.api.ContainerFactory;
import co.q64.teagame.web.js.spi.pixi.JsContainer;

@AutoFactory(implementing = { ContainerFactory.class })
public class ContainerImpl extends DisplayObjectImpl implements Container {
	private JsContainer container;

	protected ContainerImpl(@Provided JsContainer containerFactory) {
		super(containerFactory);
		this.container = containerFactory;
	}

	@Override
	public DisplayObject addChild(DisplayObject object) {
		container.addChild(((DisplayObjectImpl) object).getObject());
		return object;
	}
}
