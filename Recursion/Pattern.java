package Recursion;

public class Pattern {

	public static void main(String[] args) {
		triangle(4, 0);
	}

	private static void triangle(int r, int c) {
		if (r == 0) {
			return;
		}
		if (c < r) {
			System.out.print("* ");
			triangle(r, c + 1);

		} else {
			System.out.println();
			triangle(r - 1, 0);

		}
	}

}
