package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return width*height;
	}
	public double perimeter() {
		return height*2+width*2;
	}
	public double diagonal() {
		double h = width*width + height*height;
		return (Math.sqrt(h));
	}
}
