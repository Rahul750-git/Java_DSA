package Recursion;

public class ClimbingStairs {
    static int climbStairs(int n){
        // base case
        if(n<=2){
            return n;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static void main(String[] args) {
        int n = 3;
        int ans = climbStairs(n);
        System.out.println(ans);
    }
}
