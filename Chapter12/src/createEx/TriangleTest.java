package createEx;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Triangle trig = new Triangle(5, 6, 13);
		} catch (IllegalTriangleException e) {
			System.out.print(e);;
		}
	}

}
