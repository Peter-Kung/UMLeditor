package UMLeditor;

public class AssociateButton extends Button {
	
	final int buttonIndex = 1;
	private String name;
	
	public AssociateButton() {
		super("AssociateButton");
		name = "AssociateButton";
		setBounds(0,100,80,80);
		setBackground(null);
		addActionListener(new Listener(name));
		
	}
}
