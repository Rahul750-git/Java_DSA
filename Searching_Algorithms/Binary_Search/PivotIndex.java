package Searching_Algorithms.Binary_Search;

public class PivotIndex {
    public static void main(String[] args) {
        int arr[] = { 50, 60, 70, 80, 10, 20, 30, 40 };
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
