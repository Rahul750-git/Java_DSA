package Recursion;

public class MinimumEle {
        static void minEle(int arr[], int mini, int i) {
        if (i >= arr.length) {
            System.out.println("Minimum element is: " + mini);
            return;
        }
        if (arr[i] < mini) {
            mini = arr[i];
        }

        minEle(arr, mini, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int mini = Integer.MAX_VALUE;
        int i = 0;
        minEle(arr, mini, i);

    }
}
