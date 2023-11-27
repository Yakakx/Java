package Exercise;
import java.util.*;

public class e6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num1, num2, num3;
		System.out.println("Please enter three numbers");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		sortNum(num1,num2,num3);
	}
	public static void sortNum(double num1, double num2, double num3) {
		double max=0, mid=0, min=0;
		if(num1>num2&&num1>num3) {
			if(num2>num3) {
				max=num1;mid=num2;min=num3;
			}
			else {
				max=num1;mid=num3;min=num2;
			}
		}
		else if(num1>num2&&num1<num3) {
			max=num3;mid=num1;min=num2;
		}
		else if(num1<num2&&num1<num3) {
			if(num2<num3) {
				max=num3;mid=num2;min=num1;
			}
			else {
				max=num2;mid=num3;min=num1;
			}
		}
		else {
			max=num2;mid=num1;min=num3;
		}
		System.out.println(max+" "+mid+" "+min);
	}
}
