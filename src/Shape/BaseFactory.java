package Shape;

import java.awt.Component;

public abstract class BaseFactory{

	/* Composite Design pattern: perlocating */
	public Base createShape(String type, int x, int y) {
		return this.factoryMethod(type, x, y);
	}
	public Line createShape(String type, Port press, Port release) {
		return this.factoryMethod(type, press, release);
	}
	public abstract Base factoryMethod(String type,int x1,int y1);
	protected abstract Line factoryMethod(String type, Port press, Port release);
	
}
