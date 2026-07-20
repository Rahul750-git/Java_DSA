package Searching_Algorithms.Binary_Search;

public class AlmostSorted {

    static int findTarget(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid + 1 < n && arr[mid + 1] == target) {
                return mid + 1;
            }
            if (arr[mid] == target) {
                return mid;
            }
            if (mid - 1 >= 0 && arr[mid - 1] == target) {
                return mid - 1;
            }
            if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 30, 20, 40 };
        int target = 20;
        int ans = findTarget(arr, target);
        System.out.println(ans);
    }

}
