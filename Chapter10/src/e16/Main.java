package e16;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		for(int i=1, j=0; i<=100&&j<10; i++) {
			if(m.divByTwo(i)==true&&m.divByThree(i)==true) {
				System.out.print(i+" ");
				j++;
			}
		}
	}
	public boolean divByTwo(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean divByThree(int num) {
		if(num%3==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
