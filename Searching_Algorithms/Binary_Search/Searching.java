package Searching_Algorithms.Binary_Search;

public class Searching {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int n = arr.length;
        int target = 80;
        int start = 0;
        int end = n-1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            // compare target
            if (arr[mid] == target) {
                System.out.println(mid);
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
    }
}
