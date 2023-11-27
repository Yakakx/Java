package Exercise;
import java.util.*;

public class e6_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		System.out.println("result is: "+convertMillis(value));
	}
	public static String convertMillis(int value) {
		int sec, min, hr;
		sec=value/1000;
		
		if(sec>=60) {
			min=sec/60;
			sec-=min*60;
		}
		else {
			min=0;
		}
		if(min>=60) {
			hr=min/60;
			min-=hr*60;
		}
		else {
			hr=0;
		}
		return Integer.toString(hr)+":"+Integer.toString(min)+":"+Integer.toString(sec);
		
	}
}
