package Searching_Algorithms.Binary_Search;

public class PeakIndex {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,4,2};
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while (s<=e) {
            int mid = s + (e-s)/2;
            if (arr[mid]>=arr[mid+1]) {
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
