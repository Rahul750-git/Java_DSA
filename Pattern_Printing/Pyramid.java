package Pattern_Printing;

public class Pyramid {
    public static void main(String[] args) {
          int n=5;
        for (int row = 1; row <= n; row++) {

            // space
            for (int col = 1; col <=n-row; col++) {
                System.out.print("  ");
            }
            //stars
            for (int j = 1; j <=2*row-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
