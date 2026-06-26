package Array_Questions.Manipulation_Prob;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 9 };
        int n = arr.length, i = 0, j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
}
