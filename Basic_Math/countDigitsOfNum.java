package Basic_Math;

public class countDigitsOfNum {
    public static void main(String[] args) {
        int n = 53127;
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }

}
