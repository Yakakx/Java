package E15;
import java.util.*;
public class E15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		System.out.print("Enter 10 Values: ");
		for(int i=0; i<num.length; i++) {
			num[i]=input.nextInt();
		}
		int[] uniqueNum = eliminateDuplicates(num);
		displayUniqueValues(uniqueNum);
	}
	public static int[] eliminateDuplicates(int[] num) {
		int[] uniqueValues = new int[num.length];
        for (int i = 0, j = 0; i < num.length; i++)
            if (!checkIfExists(uniqueValues, num[i]))
                uniqueValues[j++] = num[i];
            
        return uniqueValues;
	}
	public static boolean checkIfExists(int[] list, int number)
    {
        for (int i = 0; i < list.length; i++)
            if (number == list[i])
                return true;

        return false;
    }
	public static void displayUniqueValues(int[] distinctNumbers)
    {
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctNumbers.length; i++)
            if (distinctNumbers[i] > 0)
                System.out.print(distinctNumbers[i] + " ");
    }
}
