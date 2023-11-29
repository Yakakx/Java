package e01;

public class Triangle extends Geometric{
	
	double side1 = 1, side2 = 1, side3 = 1;
	
	public Triangle() {
		
	}
	public Triangle(double a, double b, double c) {
		side1 = a;
		side2 = b;
		side3 = c;
	}
	public double getSide1() {
		return this.side1;
	}
	public double getSide2() {
		return this.side2;
	}
	public double getSide3() {
		return this.side3;
	}
	public double getArea() {
		double s = this.getPerimeter()/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	public double getPerimeter() {
		return (side1+side2+side3);
	}
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
}
