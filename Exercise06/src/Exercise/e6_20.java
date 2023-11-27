package Exercise;
import java.util.*;

public class e6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		countLetters(s);
	}
	public static void countLetters(String s) {
		int count = 0;
		String tokens[] = s.split(" ");
		int words = tokens.length;
		for(int i=0;i<words;i++) {
			for(int j=0;j<tokens[i].length();j++) {
				char c = tokens[i].charAt(j);
					if(Character.isLetter(c)) {
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
