package E05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        int number, odd = 0, even = 0;
        System.out.print("Enter numbers: ");
        do {
        	number= input.nextInt();
        	if (number % 2 != 0)
                odd++;
            else if (number != 0)
                even++;
        }while (number!=0);
        System.out.println("The number of odd numbers: " + odd);
        System.out.println("The number of even numbers: " + even);
	}
}
