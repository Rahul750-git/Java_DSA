package Searching_Algorithms.Binary_Search;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 56;
        int s = 1;
        int e = n;
        int ans = -1;
        while (s<=e) {
            int mid = s + (e-s)/2;
            if(mid * mid == n){
                System.out.println(mid);
            }
            else if(mid * mid > n){
                e = mid -1;
            
            }
            else{
                ans = mid;
                s = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
