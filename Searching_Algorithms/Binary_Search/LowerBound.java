package Searching_Algorithms.Binary_Search;

public class LowerBound {
    public static void main(String[] args) {
        int arr[] = {10,20,30,30,30,30,40,50};
        int target = 30;
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]>=target){
                ans = mid;
                e = mid - 1;

            }else{
                s = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
