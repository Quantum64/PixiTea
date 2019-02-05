package co.q64.pixitea.test;

import co.q64.pixitea.PixiTea;

public class Test {
	public static void main(String[] args) {
		TestComponent component = DaggerTestComponent.create();
		PixiTea tea = component.getPixiTea();
		tea.loadScripts();
	}
}
