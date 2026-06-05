package Pattern_Printing;

public class Count {
    public static void main(String[] args) {
        int n = 87;
        int count = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    
}
