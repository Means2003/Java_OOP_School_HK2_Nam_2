package Ex4;
import java.util.*;

public class Circle{
    private double radius;
    private String color;
    public Circle(){
        radius = 1;
        color = "red";
    }
    public Circle(double radius) { 
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color) { 
        this.radius = radius;
        this.color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double Circumference() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Cricle[radius = "+this.radius+"; color = "+this.color+"]";
    }
}
