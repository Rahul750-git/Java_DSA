package Array_Questions.Manipulation_Prob;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 0, 1 };
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        for (int num : arr) {
            System.out.println(num);
        }
        // int count = 0;
        // for (int num : arr) {
        // if (num == 0) {
        // count++;
        // }
        // }
        // for (int i = 0; i < count; i++) {
        // arr[i] = 0;
        // }
        // for (int i = count; i < n; i++) {
        // arr[i] = 1;
        // }
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }

    }
}
