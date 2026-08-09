package Recursion;

public class MaxElement {
    static void maxEle(int arr[], int maxi, int i) {
        if (i >= arr.length) {
            System.out.println("Maximum element is: " + maxi);
            return;
        }
        if (arr[i] > maxi) {
            maxi = arr[i];
        }

        maxEle(arr, maxi, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int maxi = Integer.MIN_VALUE;
        int i = 0;
        maxEle(arr, maxi, i);

    }
}
