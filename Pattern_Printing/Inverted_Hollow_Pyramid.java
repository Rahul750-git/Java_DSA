package Pattern_Printing;

public class Inverted_Hollow_Pyramid {
    public static void main(String[] args) {
        int n = 5;
        // part 1
        for (int row = 1; row <= n; row++) {

            // spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            if (row == 1) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                // middle row
                System.out.print("* ");
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }

                System.out.print("* ");

            }
            System.out.println();
        }
        // part2
        for (int row = 1; row <=(n-1); row++) {

            // part1
            for (int i = 1; i <= row; i++) {
                System.out.print("  ");
            }
            // part2
            if (row == (n - 1)) {
                System.out.print("* ");

            } else {
                // remaining rows
                // 1*
                System.out.print("* ");
                // (2(n-r)-3)spaces
                for (int i = 1; i <=2*(n-row)- 3; i++) {
                    System.out.print("  ");
                }
                // 1*
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
