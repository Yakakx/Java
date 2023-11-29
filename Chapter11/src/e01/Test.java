package e01;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 sides of a triangle, a color, and a Boolean value to indicate\r\n"
				+ "whether the triangle is filled: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		String color = input.next();
		boolean fill = input.nextBoolean();
		
		Triangle trig = new Triangle(side1, side2, side3);
		trig.setColor(color);
		trig.setFilled(fill);
		
		System.out.println("Area: " + trig.getArea());
		System.out.println("Perimeter: " + trig.getPerimeter());
		System.out.println("Color: " + trig.getColor());
		System.out.println("Filled: " + trig.isFilled());
	}
}
