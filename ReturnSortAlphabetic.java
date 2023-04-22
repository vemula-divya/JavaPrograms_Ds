
import java.util.Arrays;
import java.util.Scanner;

public class ReturnSortAlphabetic {

	public static void main(String[] args) {
		// if a string is sorted in alphabetical order and print o if it is
		// .if not in ao,then print the index of char where it is odd
		Scanner in = new Scanner(System.in);
		String is = in.nextLine();
		int result = funAlphabeticOrder(is);
		System.out.println(result);
	}

	private static int funAlphabeticOrder(String is) {
		int answer = 0;
		int length = is.length();
		char c[] = new char[length];
		for (int i = 0; i < length; i++) {
			c[i] = is.charAt(i);
		}
		Arrays.sort(c);
		for (int i = 0; i < length; i++) {
			if (c[i] != is.charAt(i)) {
				return i + 1;
			}
		}

		return answer;
	}

}