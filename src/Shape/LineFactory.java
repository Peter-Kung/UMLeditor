package Shape;

public class LineFactory extends BaseFactory {

	@Override
	public Line factoryMethod(String type, Port press, Port release) {
		
		switch(type) {
		case "Associate":
			return new AssociateLine(press, release);
		case "Composite":
			return new CompositeLine(press, release);
		case "Generalize":
			return new GeneralizeLine(press, release);
		}
		
		return null;
	}
	/* Composite Design pattern: perlocating */
	@Override
	public Base factoryMethod(String type, int x1, int y1) {
		// TODO Auto-generated method stub
		return null;
	}

}
