package createEx;

public class IllegalTriangleException extends Exception {
	
	private double a;
	private double b;
	private double c;
	 
	public IllegalTriangleException(double a, double b, double c) {
		super("Invalid combination of sides");
		  this.a = a;
		  this.b = b;
		  this.c = c;
	  }
	 
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
}
