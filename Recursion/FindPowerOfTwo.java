package Recursion;

public class FindPowerOfTwo {
    static int isPoweredOfTwo(int n){
        if (n == 0) {
            return 1;
        }
        return 2 * isPoweredOfTwo(n-1);
    }
    static boolean isPowerOfTwo(int num){
        return num > 0  && (num & (num-1)) == 0;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = isPoweredOfTwo(n);
        System.out.println(ans);
        System.out.println(isPowerOfTwo(4));
    }
}
