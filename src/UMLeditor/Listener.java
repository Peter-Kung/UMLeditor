package UMLeditor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {
	
	String type;
	public Listener(String t) {
		type = t;
	}
	
	public void actionPerformed(ActionEvent e) {
		switch(type) {
		case "SelectButton":
		case "AssociateButton":
		case "GeneralizaButton":
		case "CompositeButton":
		case "ClassButton":
		case "UsecaseButton":
				
		}
	}
}