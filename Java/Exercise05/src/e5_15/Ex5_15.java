package e5_15;

public class Ex5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=33; i<=126; i++) {
			char c = (char)i;
			System.out.print(c+" ");
			count++;
			if(count%10==0) {
				System.out.println();
			}
		}
	}

}
