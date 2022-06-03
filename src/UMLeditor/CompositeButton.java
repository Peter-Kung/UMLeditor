package UMLeditor;

public class CompositeButton extends Button {
	final int buttonIndex = 3;
	private String name;

	public CompositeButton() {
		super("CompositeButton");
		name = "CompositeButton";
		setBounds(0,260,80,80);
		setBackground(null);
		addActionListener(new Listener(name, buttonIndex));
	}
}
