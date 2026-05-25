package Pattern_Printing;

public class Inverted_Right_Angle {
    public static void main(String[] args) {
        int n = 5;
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= n - j + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
