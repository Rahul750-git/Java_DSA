package Basic_Math;

public class printNumber {
    public static void main(String[] args) {
        int n = 53127;
        while (n != 0) {
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
    }

}
