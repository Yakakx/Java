package E10;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 Values: ");
		for(int i = 0; i<array.length; i++) {
			array[i]=input.nextInt();
		}
		System.out.println("The index of largest element is "+ 
		indexOfLargestElement(array));
	}
	public static int indexOfLargestElement(int[] array) {
		int maxVal = array[0], maxIndex = 0;
		 for (int i = 0; i < array.length; i++)
	        {
	            if (array[i] >= maxVal)
	            {
	                maxVal = array[i];
	                maxIndex = i;
	            }
	        }
	        return maxIndex;
	}
}
