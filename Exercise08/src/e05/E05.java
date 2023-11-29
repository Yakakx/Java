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
		System.out.println("result is:\n" + addMatrix(matrixA, matrixB)[0][0]+" "+addMatrix(matrixA, matrixB)[0][1]+
				" "+"\n"+addMatrix(matrixA, matrixB)[1][0]+" "+addMatrix(matrixA, matrixB)[1][1]);
	}
	public static int[][] addMatrix(int[][] a, int[][] b){
		int[][] result= new int [2][2];
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				result[i][j]=a[i][j]+b[i][j];
			}
		}
		return result;
	}
}
