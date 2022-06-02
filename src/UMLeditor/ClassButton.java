package UMLeditor;

public class ClassButton extends Button {
	final int buttonIndex = 4;
	private String name;

	public ClassButton() {
		super("ClassButton");
		name = "ClassButton";
		setBounds(0, 340, 80, 80);
		setBackground(null);
		addActionListener(new Listener(name));
	}
}
