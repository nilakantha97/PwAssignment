package patterns;

public class Day_9_Assignment_4 {

	public static void main(String[] args) {
		int i, j;
		int n = 10;

		// Print PW Skills
		for (i = 0; i < n; i++) {
			// 1st j loop "P"
			for (j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j < (n - 1) || i == (n - 1) / 2 && j < (n - 1)
						|| j == (n - 1) && i > 0 && i < (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 2nd j loop "W"
			for (j = 0; j < n; j++) {
				if (j == 0 || j == (n - 1) || i == j && j > (n - 1) / 2 && i > (n - 1) / 2
						|| i + j == n - 1 && i >= (n - 1) / 2 && j <= (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t\t");

			// 3rd j loop "S"
			for (j = 0; j < n; j++) {
				if (i == 0 && j > 0 || j == 0 && i < (n - 1) / 2 && i > 0 || i == (n - 1) / 2 && j > 0 && j < (n - 1)
						|| j == (n - 1) && i > (n - 1) / 2 && i < (n - 1) || i == (n - 1) && j < (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 4th j loop "K"

			for (j = 0; j < n; j++) {
				if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("");

			// 5th j loop "I"

			for (j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2 && i >= 0 || i == (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.print(" ");

			// 6th j loop "L"

			for (j = 0; j < n; j++) {
				if (j == 0 || i == (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 7th j loop "L"

			for (j = 0; j < n; j++) {
				if (j == 0 || i == (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 8th j loop "S"
			for (j = 0; j < n; j++) {
				if (i == 0 && j > 0 || j == 0 && i < (n - 1) / 2 && i > 0 || i == (n - 1) / 2 && j > 0 && j < (n - 1)
						|| j == (n - 1) && i > (n - 1) / 2 && i < (n - 1) || i == (n - 1) && j < (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");
			System.out.println();
		}

	}

}
