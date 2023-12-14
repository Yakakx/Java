import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入除數範圍: ");
		int num1 = input.nextInt();
		System.out.println("請輸入被除數範圍: ");
		int num2 = input.nextInt();
		System.out.println("乘法表: ");
		for(int i=1; i<=num1; i++) {
			for(int j=1; j<=num2; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println("-----------");
		}
	}

}
