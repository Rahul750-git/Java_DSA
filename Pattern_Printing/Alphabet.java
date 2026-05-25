package Pattern_Printing;

public class Alphabet {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                int a = j;
                int b = ('A' - 1);
                int ans = a+b;
                char finalans = (char)ans;
                System.out.print(finalans+" ");
            }
            System.out.println();
        }
    }
}
