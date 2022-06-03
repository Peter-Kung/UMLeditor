package UMLeditor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Mode.CreateLineMode;
import Mode.CreateObjMode;
import Mode.SelectMode;

public class Listener implements ActionListener {
	
	private String type;
	private int INDEX_OF_BUTTON; 
	private MyPanel panel = MyPanel.getInstance();
	
	public Listener(String t, int index) {
		type = t;
		INDEX_OF_BUTTON = index;
	}
	
	public void actionPerformed(ActionEvent e) {
		switch(type) {
		case "SelectButton":
			panel.setMode(new SelectMode());
			break;
		case "AssociateButton":
			panel.setMode(new CreateLineMode("Associate"));
			break;
		case "GeneralizeButton":
			panel.setMode(new CreateLineMode("Generalize"));
			break;
		case "CompositeButton":
			panel.setMode(new CreateLineMode("Composite"));
			break;
		case "ClassButton":
			panel.setMode(new CreateObjMode("Class"));
			break;
		case "UsecaseButton":
			panel.setMode(new CreateObjMode("Usecase"));
			break;
		}
		panel.resetButtoncolor(INDEX_OF_BUTTON);
		
	}
}