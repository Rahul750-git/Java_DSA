package Pattern_Printing;

public class Square {
    public static void main(String[] args) {
        int n =5;
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <=n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
}
