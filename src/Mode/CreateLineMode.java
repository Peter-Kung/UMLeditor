package Mode;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;


import Shape.Base;
import Shape.BaseFactory;
import Shape.Line;
import Shape.LineFactory;
import Shape.Port;

public class CreateLineMode extends Mode {
	
	BaseFactory factory;
	private String type;
	private int startportnum;
	private int endportnum;
	private Base start;
	private Base end;
	private Port press;
	private Port release;
	
	public CreateLineMode (String kind) {
		type = kind;
		factory = new LineFactory();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		int i;
		Point p;
		Graphics g=panel.getGraphics();
		int temp=-1;
		for(i=panel.get_size()-1;i>=0;i--) {
			Base cur=panel.getmember(i);
			if(cur.check(e.getX(), e.getY())) {
				int t1=e.getX()-cur.getx1();
				int t2=cur.gety1()-e.getY();
				temp=cur.check_area(t1, t2);
				if(temp!=-1) {
					press=cur.getport(temp);
					start=cur;
					startportnum=temp;
					break;
				}
				
			}
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
		int i;
		Point p;
		int temp=-1;
		Graphics g=panel.getGraphics();
		for(i=panel.get_size()-1;i>=0;i--) {
			Base cur=panel.getmember(i);
			if(cur.check(e.getX(), e.getY())) {
				int t1=e.getX()-cur.getx1();
				int t2=cur.gety1()-e.getY();
				/* 確定哪個 area 的 port */
				temp=cur.check_area(t1, t2);
				if(temp!=-1) {
					release=cur.getport(temp);
					end=cur;
					endportnum=temp;
					break;
				}
				
			}
		}
		
		if(temp==-1||press==null||release==null || start == end) return;
		panel.add(factory.createShape(type, press,release));
		panel.repaint();

	}
	
}
