package Pattern_Printing;

public class Inverted_Pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {

            //spaces
            for (int col = 1; col <=row-1; col++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*n-2*row+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}
