package Basic_Math;

public class ArmstrongNum {
    public static void main(String[] args) {
        int n = 159;
        int originalNum = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            int cubeDigit = digit * digit * digit;
            sum = sum + cubeDigit;
            n = n / 10;
        }

        if (sum == originalNum) {
            System.out.println("It is a ArmStrong Number");
        } else {
            System.out.println("It is not ArmStrong Number");
        }
    }

}
