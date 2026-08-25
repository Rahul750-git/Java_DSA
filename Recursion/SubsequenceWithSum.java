package Recursion;

public class SubsequenceWithSum {

    static boolean solve(int arr[], int k, int sum, int index) {
        if (index >= arr.length) {
            if (sum == k)
                return true;
            else
                return false;
        }
        int currVal = arr[index];
        boolean excludekaAns = solve(arr, k, sum, index + 1);
        boolean includekaAns = solve(arr, k, sum + currVal, index + 1);
        boolean finalAns = excludekaAns || includekaAns;
        return finalAns;
    }

    public static boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        int index = 0;
        int sum = 0;
        boolean ans = solve(arr, k, index, sum);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 1, 2, 7, 6, 1, 5 };
        int k = 8;
        boolean ans = checkSubsequenceSum(arr, k);
        System.out.println(ans);
    }
}
