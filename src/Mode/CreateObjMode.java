package Mode;


import java.awt.event.MouseEvent;

import Shape.Base;
import Shape.BaseFactory;
import Shape.BasicObject;
import Shape.ObjectFactory;

public class CreateObjMode extends Mode{
		
	private BaseFactory factory;
	private String type;
	
	public CreateObjMode(String shape) {
		type = shape;
		factory = new ObjectFactory();
	}
	
	public void mousePressed(MouseEvent e) {
		panel.add(factory.createShape(type, e.getX(), e.getY()));
		panel.repaint();
	}
	
}
