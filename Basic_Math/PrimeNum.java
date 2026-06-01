package Basic_Math;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Not a Prime");
                break;
            }
            else{
                System.out.println("Is a Prime");
                break;
            }
        }
    }
    
}
