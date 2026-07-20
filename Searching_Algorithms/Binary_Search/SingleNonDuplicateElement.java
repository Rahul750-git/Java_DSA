package Searching_Algorithms.Binary_Search;



public class SingleNonDuplicateElement {
    public static int firstNonRepeating(int[] arr) {
        // code here
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (s == e) {
                return arr[s];
            }
            int currentValue = arr[mid];
            int prevValue = -1;
            if (mid - 1 >= 0) {
                prevValue = arr[mid - 1];
            }
            int nextValue = -1;
            if (mid + 1 < n) {
                nextValue = arr[mid + 1];
            }
            if (currentValue != prevValue && nextValue != currentValue) {
                return currentValue;
            }
            if (currentValue != prevValue && nextValue == currentValue) {
                int startingIndexOfPair = mid;
                if ((startingIndexOfPair & 1) == 1) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else if (currentValue == prevValue && nextValue != currentValue) {
                int endingIndexOfPair = mid;
                if ((endingIndexOfPair & 1) == 1) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,5,5};
        int ans = firstNonRepeating(arr);
        System.out.println(ans);
    }
}
