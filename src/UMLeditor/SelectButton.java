package UMLeditor;

import java.awt.event.ActionEvent;

public class SelectButton extends Button {
	
	final int buttonIndex = 0;
	private String name;
	
	public SelectButton() {
		super("SelectButton");
		name = "SelectButton";
		setBounds(0, 20, 80, 80);
		setBackground(null);
		addActionListener(new Listener(name, buttonIndex));
		
	}
	
	
}
