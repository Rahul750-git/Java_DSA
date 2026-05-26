package Pattern_Printing;

public class Alphabet_Pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // part2
            for (int j = 1; j <= i; j++) {
                int a = j;
                int b = ('A' - 1);
                int ans = a + b;
                char finalAns = (char) ans;
                System.out.print(finalAns + " ");
            }
            // part3
            char toPrint = (char) (i + 'A' - 2);
            for (int j = 1; j <= i - 1; j++) {

                System.out.print(toPrint + " ");
                toPrint--;
            }
            System.out.println();
        }
    }

}
