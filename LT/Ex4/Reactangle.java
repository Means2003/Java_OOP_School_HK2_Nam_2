package Ex4;

public class Reactangle {

	private float width = 1;
	private float length = 1;
	public Reactangle() {
		width = 1;
		length = 1;
	}
	public Reactangle(float width, float length) {
	    this.width = width;
	    this.length = length;

	}
	public void setWidth(float width) {
	    if (width < 0.0 || width > 20.0) {
	        throw new IllegalArgumentException(Float.toString(this.width));
	    } else {
	        this.width = width;
	    }
	}
	public float getWidth() {
	    return width;
	}
	public void setLength(float length) {
	    if (length < 0.0 || length > 20.0) {
	        throw new IllegalArgumentException(Float.toString(length));
	    } else {
	        this.length = length;
	    }
	}
	public float getLength() {
	    return length;
	}
	public float getArea() {
	    return length * width;
	}
	public float getPerimeter() {
	    return length + length + width + width;
	}
	@Override
	public String toString() {
		return "Rectangle[width = "+this.width+"; length = "+this.length+"]";
	}
}