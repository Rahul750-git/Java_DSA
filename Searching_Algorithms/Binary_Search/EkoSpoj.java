package Searching_Algorithms.Binary_Search;

public class EkoSpoj {
    static boolean isValidAns(int arr[], int m, int maxHeight) {
        long totalWoodCollected = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxHeight) {
                long currentWoodCollected = arr[i] - maxHeight;
                totalWoodCollected += currentWoodCollected;
            }
        }
        if (totalWoodCollected >= m) {
            return true;
        } else {
            return false;
        }
    }

    static int maxSawHeight(int arr[] , int m){
        int n = arr.length;
        int s = 0;
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        int ans = -1;
        int e = max;
        while (s<=e) {
            int mid = s + (e-s)/2;
            if (isValidAns(arr, m, mid)) {
                ans = mid;
                 s = mid + 1;

            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={20,15,10,17};
        int m = 7;
        int ans = maxSawHeight(arr, m);
        System.out.println(ans);
    }

}
