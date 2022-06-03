package UMLeditor;

import javax.swing.JFrame;

public class UMLeditor extends JFrame {
	
	private MyPanel panel;
	
	public UMLeditor() {
		panel = MyPanel.getInstance();
		getContentPane().add(panel);
		panel.setLayout(null);

	}
	
	public static void main(String[] args) {
		UMLeditor umleditor = new UMLeditor();
		umleditor.setTitle("110525010---UML Editor");
		umleditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		umleditor.setSize(1200, 700);
		umleditor.setVisible(true);
	}
}
