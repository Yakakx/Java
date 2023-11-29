package ex1;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle(4,40);
		Rectangle b = new Rectangle(3.5,35.9);
		System.out.printf("Rectangle A's width is %.2f, height is %.2f, \narea is %.2f "+ 
				"perimeter is %.2f",a.width,a.height,a.getArea(),a.getPerimeter());
		System.out.printf("\n\nRectangle B's width is %.2f, height is %.2f, \narea is %.2f "+ 
				"perimeter is %.2f",b.width,b.height,b.getArea(),b.getPerimeter());
	}

}
