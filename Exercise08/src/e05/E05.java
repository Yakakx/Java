package e05;
import java.util.*;

public class E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 2;
		int[][] matrixA = new int [size][size];
		int[][] matrixB = new int [size][size];
		Scanner input = new Scanner(System.in);
		for(int num=0; num<2; num++) {
			System.out.printf("Enter matrix %d: \n",num+1);
			for(int i = 0; i<size; i++) {
				for(int j = 0; j<size; j++) {
					if(num==0) {
						matrixA[i][j]=input.nextInt();
					}
					else {
						matrixB[i][j]=input.nextInt();
					}
				}
			}
		}
		int[][] result = addMatrix(matrixA, matrixB, size);
		displayResult(result,size);
	}
	public static int[][] addMatrix(int[][] a, int[][] b, int size){
		int[][] result= new int [size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				result[i][j]=a[i][j]+b[i][j];
			}
		}
		return result;
	}
	public static void displayResult(int[][] result, int size) {
		System.out.println("The result is: ");
		for(int i=0; i<size; i++) {
			for (int j = 0; j < size; j++) {
                System.out.print(result[i][j] + " ");
            }
			System.out.println();
		}
	}
}
