enum VehiccleType {
    	CIRCLE,Square,Rectangle, 
}
public class ShapeFactory {
   public Shape getShape (VehiccleType type) {
	    switch (type) {
		case CIRCLE:
			return new Circle();
		case Square:
			 return new Square();
		case Rectangle:
			return  new Rectangle();
		}
	    return null;
   }
}
