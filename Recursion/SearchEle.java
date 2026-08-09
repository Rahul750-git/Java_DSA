package Recursion;

public class SearchEle {
    static void linearSearch(int arr[], int target, int i) {
        if (i>=arr.length) {
            return;
        }
        if (arr[i] == target) {
            System.out.println(i);
            return;
        }
        linearSearch(arr, target, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int i = 0;
        int target = 50;
        linearSearch(arr, target, i);
    }
}
