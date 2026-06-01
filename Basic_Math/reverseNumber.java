package Basic_Math;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 53127;
        int revNum = 0;
        while (n != 0) {
            int digit = n % 10;
            revNum = revNum * 10 + digit;
            System.out.print(digit);
            n = n / 10;
        }
    }

}
