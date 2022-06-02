package UMLeditor;

import javax.swing.JButton;

public class Button extends JButton{
	private MyPanel panel;
	
	public Button(String name) {
		panel = MyPanel.getInstance();
		setText(name);
		setVisible(true);
	}
}
