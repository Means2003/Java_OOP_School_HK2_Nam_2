import java.util.Scanner;
import java.util.Vector;

class Circle {
	protected double radius;
	protected String color;
	public Circle(){
		this(1,"Red");
	}
	public Circle (double radius){
		this(radius,"Red");
	}
	public Circle (double radius, String color){
		this.radius =radius;
		this.color =color;
	}
	public double getRadius(){
		return radius;
	}
	public String getcolor(){
		return color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle["+radius+","+color+"]";
	}
}
class Cylinder extends Circle {
		private double height;
		public Cylinder (){
			super();
			this.height=1;
		}
		public Cylinder (double radius){
			super(radius);
			this.height=1;
		}
		public Cylinder(double radius, double height){
			super(radius);
			this.height=height;
		}
		public Cylinder (double radius, double height, String color){
			super(radius,color);
			this.height=height;
		}
		public double getHeight(){
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getVolume(){
			return height *super.getArea();
		}
		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return 2*super.getArea() +2* Math.PI* getRadius()* height;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+height;
		}
}
	
public class baitap {
	public Circle inputCircle (Scanner sc){
		double radius =sc.nextDouble();
		String color =sc.nextLine();
		return new Circle (radius, color);
	}
	public Cylinder inputCylinder (Scanner sc){
		double radius =sc.nextDouble();
		String color =sc.nextLine();
		double height =sc.nextDouble();
		return new Cylinder (radius, height ,color);
	}
	public void main (String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int n = sc.nextInt();
//		Vector<Circle> lst = new Vector<Circle>();
//		for(int i=0; i<n; i++){
//			Circle c;
//			int typeChape= sc.nextInt();
//			switch(typeChape)
//			{
//			case 1:
//				c =inputCircle(sc);
//				lst.add(c);
//				break;
//			case 2:
//				c = inputCylinder(sc);
//				lst.add(c);
//				break;
//			}
//		}
		Circle c1 = new Circle(1.5, "Yello");
		Cylinder c2 = new Cylinder(1.5, 2);
		System.out.println(c1 + "\t" + c1.getArea());
		System.out.println(c2 + "\t" + c2.getVolume());
	}
}

