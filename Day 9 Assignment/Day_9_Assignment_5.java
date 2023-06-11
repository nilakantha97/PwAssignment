package patterns;

//5th question
public class Day_9_Assignment_5 {

	public static void main(String[] args) {
		int i, j;
		int n = 10;
		for (i = 0; i < n; i++) {
			// First Name "Nilakantha"
			// 1st j loop "N"
			for (j = 0; j < n; j++) {
				if (i >= 0 && j == 0 || j == (n - 1) || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 2nd j loop "I"

			for (j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2 && i >= 0 || i == (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.print(" ");

			// 3rd j loop "L"

			for (j = 0; j < n; j++) {
				if (j == 0 || i == (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 4th j loop "A"

			for (j = 0; j < n; j++) {
				if (j == 0 && i > 0 || j == (n - 1) && i > 0 || i == 0 && j > 0 && j < (n - 1) || i == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 5th j loop "K"

			for (j = 0; j < n; j++) {
				if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("");

			// 6th j loop "A"

			for (j = 0; j < n; j++) {
				if (j == 0 && i > 0 || j == (n - 1) && i > 0 || i == 0 && j > 0 && j < (n - 1) || i == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 7th j loop "N"
			for (j = 0; j < n; j++) {
				if (i >= 0 && j == 0 || j == (n - 1) || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.print(" ");

			// 8th j loop "T"
			for (j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.print(" ");

			// 9th j loop "H"
			for (j = 0; j < n; j++) {
				if (j == 0 || j == (n - 1) || i == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.print(" ");

			// 10th j loop "A"

			for (j = 0; j < n; j++) {
				if (j == 0 && i > 0 || j == (n - 1) && i > 0 || i == 0 && j > 0 && j < (n - 1) || i == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t\t");

			// Last Name "Mohapatra"
			// 11th j loop "M"
			for (j = 0; j < n; j++) {
				if (j == 0 || j == (n - 1) || i == j && i <= (n - 1) / 2 && j <= (n - 1) / 2
						|| i + j == n - 1 && i <= (n - 1) / 2 && j >= (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 12th j loop "O"
			for (j = 0; j < n; j++) {
				if (j == 0 && i > 0 && i < (n - 1) || i == 0 && j > 0 && j < (n - 1)
						|| j == (n - 1) && i > 0 && i < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");
			// 13th j loop "H"

			for (j = 0; j < n; j++) {
				if (j == 0 || j == (n - 1) || i == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.print(" ");

			// 14th j loop "A"

			for (j = 0; j < n; j++) {
				if (j == 0 && i > 0 || j == (n - 1) && i > 0 || i == 0 && j > 0 && j < (n - 1) || i == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 15th j loop "P"

			for (j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j < (n - 1) || i == (n - 1) / 2 && j < (n - 1)
						|| j == (n - 1) && i > 0 && i < (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 16th j loop "A"

			for (j = 0; j < n; j++) {
				if (j == 0 && i > 0 || j == (n - 1) && i > 0 || i == 0 && j > 0 && j < (n - 1) || i == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// 17th j loop "T"
			for (j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.print(" ");

			// 18th j loop "R"
			for (j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j < (n - 1) || i == (n - 1) / 2 && j < (n - 1)
						|| j == (n - 1) && i > 0 && i < (n - 1) / 2 || i - j == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.print(" ");

			// 19th j loop "A"

			for (j = 0; j < n; j++) {
				if (j == 0 && i > 0 || j == (n - 1) && i > 0 || i == 0 && j > 0 && j < (n - 1) || i == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			System.out.println();
		}

	}

}
