package Array_Questions.Manipulation_Prob;

public class RemoveDuplicatesSortedArr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 3, 3, 4 };
        int i = 0;
        int j = 1;
        int n = arr.length;
        while (j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
