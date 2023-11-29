package exceptionPractice;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		try {
			validate(age);
			
		}
		catch(SampleException ex) {
			System.out.println(ex);
		}
	}
	public static void validate(int a) throws SampleException{
		if(a<18) {
			throw new SampleException("Age is under 18!");
		}
		else {
			System.out.println("Welcome");
		}
	}
}
