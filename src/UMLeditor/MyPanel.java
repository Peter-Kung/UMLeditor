package UMLeditor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.EventListener;
import javax.swing.JPanel;

import Mode.Mode;
import Shape.Base;
import Shape.Group;

public class MyPanel extends JPanel{
	
	private static MyPanel instance = null;
	private Base selected;
	private ArrayList<Base> objects = new ArrayList<Base>();
	private Mode currentMode;
	private Menu editbar;
	private EventListener listener = null;
	
	private Button button[]  = new Button[6];

	private MyPanel() {};
	
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
	
	public void setMode(Mode m) {
		removeMouseListener((MouseListener)listener);
		removeMouseMotionListener((MouseMotionListener)listener);
		listener = m;
		addMouseListener((MouseListener)listener);
		addMouseMotionListener((MouseMotionListener)listener);
	}
	
	public void add(Base object) {
		objects.add(object);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int i;
		for(i=objects.size()-1;i>=0;i--) {
			Base cur=objects.get(i);
			cur.draw(g);
			if(cur.select_or_not()) cur.drawboundary(g);
		}
	}

	public void resetButtoncolor(int index) {
		for (int i = 0;i < 6;i++) {
			if (i == index)
				button[i].setBackground(Color.black);
			else
				button[i].setBackground(null);
		}
		
	}

	public int get_size() {
		return objects.size();
	}

	public Base getmember(int i) {
		return objects.get(i);
	}

	public void set_selected(Base cur) {
		selected = cur;
	}
	
	public void changeName(String newName) {
		selected.changeName(newName);
		repaint();
	}

	public void group() {
		Group group=new Group(0,0,0,0);
		int i;
		for(i=objects.size()-1;i>=0;i--) {
			Base cur=objects.get(i);
			if(cur.select_or_not()) {
				group.add(cur);
				objects.remove(cur);
			}
		}
		group.setbounds();
		objects.add(group);
		group.show(getGraphics());
	}

	public void ungroup() {
		if (selected == null)return;
		for (int i = 0; i < selected.get_group_size();++i) {
			Base temp = selected.remove(i);
			temp.unselect();
			objects.add(temp);
			i--;
		}
		objects.remove(selected);
		repaint();
		
	}
}
