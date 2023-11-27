package e5_20;

public class Ex5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int count=0;
		for(int i=2; i<=1200; i++) {
			count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
				counter++;
				if(counter%8==0) {
					System.out.println();
				}
			}
		}
	}
}
