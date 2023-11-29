package e01;
import java.util.*;

public class E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 3;
		int col = 4;
		System.out.println("Enter a 3−by−4 matrix row by row: ");
		double[][] num = new double[row][col];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				num[i][j]=input.nextDouble();
			}
		}
		for(int k=0; k<row; k++) {
			System.out.printf("The sum of row %d is %.2f\n",k+1,sumRow(num,k));
		}
	}
	public static double sumRow(double[][] num, int row) {
		double sum=0;
		for(int col=0; col<num[row].length; col++) {
			sum+=num[row][col];
		}
		return sum;
	}
}
