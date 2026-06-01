package Basic_Math;

public class LCM {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        int ans = (a > b) ? a : b;
        while (true) {
            if (ans % a == 0 && ans % b == 0) {
                break;
            }
            ans++;
        }
        System.out.println("LCM of " + a + " and " + b + " : " + ans);
    }

}
