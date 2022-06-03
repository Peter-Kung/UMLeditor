package Shape;

public class ObjectFactory extends BaseFactory{

	@Override
	public Base factoryMethod(String type,int x1,int y1) {
		switch(type) {
		case "Class":
			return new ClassObject(x1,y1);
		case "Usecase":
			return new UsecaseObject(x1,y1);
		}
		return null;
	}

	@Override
	protected Line factoryMethod(String type, Port press, Port release) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
