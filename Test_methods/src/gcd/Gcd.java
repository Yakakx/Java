package gcd;
import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int val1 = input.nextInt();
		System.out.println("Enter second number");
		int val2 = input.nextInt();
		System.out.println("The gcd is "+gcd(val1,val2));
	}
	public static int gcd(int a,int b) {
		int gcd = 1;
		int k = 2;
		
		while(k<=a && k <=b) {
			if(a % k == 0 && b % k == 0) { 
				gcd = k;
			}
			k++;
		}
		return gcd;
	}
}
