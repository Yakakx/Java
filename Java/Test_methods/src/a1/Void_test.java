package a1;
import java.util.*;

public class Void_test {
	
	public static void score(int score) {
		if(score>80) {
			System.out.println("The score is A");
		}
		else if(score>70) {
			System.out.println("The score is B");
		}
		else if(score>60) {
			System.out.println("The score is C");
		}
		else if(score>50) {
			System.out.println("The score is D");
		}
		else{
			System.out.println("The score is F");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int result = Integer.parseInt(s.next());
		score(result);
	}

}
