package Recursion;

public class CountElement {
    static void countele(int arr[], int i, int target, int count) {
        if (i >= arr.length) {
            System.out.println(count);
            return;
        }
        if (arr[i] == target) {
            count++;
        }

        countele(arr, i + 1, target, count);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 10, 40, 50, 10 };
        int i = 0;
        int count = 0;
        int target = 10;
        countele(arr, i, target, count);
    }
}
