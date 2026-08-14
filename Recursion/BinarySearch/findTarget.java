package Recursion.BinarySearch;

public class findTarget {

    static int solve(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            e = mid - 1;
        }
        if (arr[mid] < target) {
            s = mid + 1;
        }
        return solve(arr, target, s, e);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 ,80};
        int target = 70;

        int s = 0;
        int e = arr.length - 1;
        int ans = solve(arr, target, s, e);
        System.out.println(ans);
    }
}
