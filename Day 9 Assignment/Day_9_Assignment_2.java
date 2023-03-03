package patterns;
//To print Triangle Using Pattern programming
public class Day_9_Assignment_2 {

	public static void main(String[] args) {
		int i,j;
		int n=11;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==(n-1)/2 || i+j==(n-1)/2 || j-i == (n-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
