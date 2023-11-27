import java.util.*;
public class test {
	
	public static int sum(int a, int b) {
		int result=0;
		for(int i=a;i<=b;i++) {
			result+=i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first digit");
		int value1 = Integer.parseInt(s.next());
		System.out.println("Enter second digit");
		int value2 = Integer.parseInt(s.next());
		System.out.printf("The sum between %d to %d is %d",
				value1,value2,sum(value1,value2));
	}

}
