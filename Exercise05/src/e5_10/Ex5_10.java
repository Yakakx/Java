package e5_10;

public class Ex5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=100;i<=1000;i++) {
			if(i%3==0||i%4==0) {
				count+=1;
				System.out.print(i+" ");
				if(count%10==0) {
					System.out.println();
				}
			}
		}
	}

}
