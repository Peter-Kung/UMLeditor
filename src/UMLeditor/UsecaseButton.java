package UMLeditor;

public class UsecaseButton extends Button {
	final int buttonIndex = 5;
	private String name;

	public UsecaseButton() {
		super("UsecaseButton");
		name = "UsecaseButton";
		setBounds(0,420,80,80);
		setBackground(null);
		addActionListener(new Listener(name));
	}
}
