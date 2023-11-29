package e10;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, and c: ");
		QuadraticEquation qe = 
				new QuadraticEquation(input.nextDouble(),input.nextDouble(),input.nextDouble());
		if(qe.getDiscriminant()==0) {
			System.out.print(qe.getRoot1());
		}
		else if(qe.getDiscriminant()>0) {
			System.out.println(qe.getRoot1());
			System.out.println(qe.getRoot2());
		}
		else {
			System.out.println("The equation has no roots.");
		}
	}

}
