import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        StringBuilder stringBuilder1 = new StringBuilder();

        int n = input.nextInt();
        input.nextLine(); // Consume the newline character after reading n

        for (int i = 0; i < n; i++) {
            stringBuilder1.append(input.nextLine());
        }
        String str = stringBuilder1.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        int m = input.nextInt();
        for(int i = 0; i<m; i++) {
        	stringBuilder2.append(str.charAt(input.nextInt()-1));
        }
        String result = stringBuilder2.toString();
        System.out.print(result);
        // Remember to close the scanner to release resources
        input.close();
    }
}

