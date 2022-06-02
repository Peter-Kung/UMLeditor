package UMLeditor;

public class GeneralizeButton extends Button {

	final int buttonIndex = 2;
	private String name;

	public GeneralizeButton() {
		super("GeneralizeButton");
		name = "GeneralizeButton";
		setBounds(0,180,80,80);
		setBackground(null);
		addActionListener(new Listener(name));
	}
}
