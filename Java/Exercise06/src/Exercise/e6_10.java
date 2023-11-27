package Exercise;
import java.util.*;

public class e6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int target = input.nextInt();
		isPrime(target);
	}
	public static void isPrime(int target) {
		boolean prime=true;
		if(target<10000) {
			for(int i=2;i<target;i++) {
				if(target%i==0) {
					prime=false;
					break;
				}
			}
			if(prime==true) {
				System.out.println("Is prime");
			}
			else {
				System.out.println("Is not prime");
			}
		}
		else {
			System.out.println("Out of range");
		}
	}
}
