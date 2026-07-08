package Searching_Algorithms.Binary_Search;

public class TotalNumberOccurrence {
    static int lbIndex(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int LB = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                LB = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return LB;
    }

    static int UbIndex(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int UB = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= target) {
                s = mid + 1;
            } else {
                UB = mid;
                e = mid - 1;
            }
        }
        return UB;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 20, 20, 20, 30, 40, 50 };
        int target = 20;
        int ans1 = lbIndex(arr, target);
        int ans2 = UbIndex(arr, target);
        int ans = ans2 - ans1;

        System.out.println(ans);

    }
}
