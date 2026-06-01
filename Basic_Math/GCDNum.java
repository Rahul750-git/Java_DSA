package Basic_Math;

public class GCDNum {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        while (b != 0) {
            int oldb = b;
            b = a % b;
            a = oldb;
        }
        int ans = a;
        System.out.print("Hcf of "+ans);
    }

}
