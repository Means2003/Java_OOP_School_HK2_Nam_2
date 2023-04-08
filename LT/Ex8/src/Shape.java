
public abstract class Shape {
	//Attributes
    protected String color;
    protected boolean filled;
    // Constructors
    public Shape() {
      this("Red",true);
    }
    public Shape(String color, boolean filled) {
    	this.color=color;
    	this.filled=filled;
    }
    // Getters && setter
    public String getColor () {
    	return this.color;
    }
    public void setColor(String color) {
		this.color = color;
	}
    //Methods
    public boolean isFilled() {
		return filled;
	}
    public void setFilled(boolean filled) {
		this.filled = filled;
	}
    public abstract double getArea();
    abstract double getPerimeter(); // mặc định là public
    abstract boolean equals(Shape s);
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "color="+color+",filled="+filled;
    }
    
}
