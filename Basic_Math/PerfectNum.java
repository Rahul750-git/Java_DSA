package Basic_Math;

public class PerfectNum {
    public static void main(String[] args) {
        int n = 7;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int firstFactor = i;
                int secondFactor = n / i;
                sum = sum + firstFactor + secondFactor;
            }
            if (sum == n) {
                System.out.println("Perfect Number");
            } else {
                System.out.println(" not Perfect Number");
            }
        }
    }

}
