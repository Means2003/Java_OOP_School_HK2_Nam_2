
public  class Rectangle extends Shape {
  protected double width;
  protected double length;
  public Rectangle( ) {
	  super();
	  this.width=width;
	  this.length=length;
  }
  public Rectangle(double width,double length,String color ,boolean filled ) {
	  super(color, filled);
	  this.width=width;
	  this.length=length;
  }
  public double getWidth() {
	return width;
 }
  public void setWidth(double width) {
	this.width = (width>0?width:0);
 }
  public double getLength() {
	return length;
 }
  public void setLength(double length) {
	this.length = length;
}
  @Override
   public double getArea() {
	// TODO Auto-generated method stub
	return 0;
   }
   @Override
   double getPerimeter() {
	// TODO Auto-generated method stub
	return 0;
   }
   @Override
   boolean equals(Shape s) {
	// TODO Auto-generated method stub
	return false;
   }
  
}
