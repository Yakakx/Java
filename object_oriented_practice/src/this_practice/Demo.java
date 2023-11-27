package this_practice;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Chicken("Chicken","Running");
		Animal b = new Animal("Bird","Walking");
		System.out.println(a.getName()+" "+a.getMove());
		System.out.println(b.getName()+" "+b.getMove());
	}

}
