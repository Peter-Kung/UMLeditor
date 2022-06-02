package UMLeditor;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	private static MyPanel instance = null;
	
	
	private MyPanel() {};
	private Menu editbar;
	
	private Button button[]  = new Button[6];;
	
	
	public static MyPanel getInstance() {
		if (instance == null) {
			instance = new MyPanel();
			instance.createButton();
		}
		return instance;
	}
	
	private void createButton() {
		
		button[0] = new SelectButton();
		button[1] = new AssociateButton();
		button[2] = new GeneralizeButton();
		button[3] = new CompositeButton();
		button[4] = new ClassButton();
		button[5] = new UsecaseButton();
		editbar = new Menu();
		
		for (int i = 0;i < 6;++i)
			add(button[i]);
		add(editbar);
	}
}
