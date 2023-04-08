
public class Circle extends Shape {
   private double radius;
   public Circle () {
	   super();
	   setRadius(1);
   };
   public Circle (String color, boolean filled,double radius) {
	   super();
	   setRadius(radius);
   };
   public double getRadius() {
	return radius;
  }
   public void setRadius(double radius) {
	this.radius = (radius>0?radius:0);
  }
  public double getArea() {
	  return 2*Math.PI*radius*radius;
  };
  double getPerimeter() {
	  return 2*Math.PI*radius;
  }
@Override
boolean equals(Shape s) {
	// TODO Auto-generated method stub
	if(s instanceof Circle) {
		Circle c = (Circle)s;
		return (this.radius==c.radius)&&this.color==c.color&&this.filled==c.filled;
	}

	return false;
	
	
   }
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "circle[radius="+radius+","+super.toString();
	}
   
}
