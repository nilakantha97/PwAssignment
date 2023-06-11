// 1. To print Albhabets A, B, C, D, E, F, G, H, Using Pattern programming
public class Day_9_Assignment_1 {
    public static void main(String[] args) 
    {
        int n = 10;

        for (int i = 0; i < n; i++) {

            // Print A
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) / 2 || j == 0 && i > 0 || i == (n - 1) / 2 && j <= (n - 1) / 2
                        || j == (n - 1) / 2 && i > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
        System.out.println();System.out.println();

        // print B

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) / 2 || j == 0 || i == (n - 1) && j < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2 || i > 0 && j == (n - 1) / 2 && i < (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // print C

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || i == 0 && j > 0 || i == (n - 1) && j > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // print D

        for (

                int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || i == (n - 1) && j < (n - 1)
                        || j == (n - 1) && i > 0 && i < (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // print E

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) || i == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // print F

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 3) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // print G

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 && i < (n - 1)
                        || i == (n - 1) && j < (n - 1) && j > 0
                        || j == (n - 1) && i <= (n - 1) / 7 && i > 0
                        || i >= (n - 1) / 1.5 && i < (n - 1) && j == (n - 1)
                        || i == (n - 1) / 1.5 && j > (n - 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Print H

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}