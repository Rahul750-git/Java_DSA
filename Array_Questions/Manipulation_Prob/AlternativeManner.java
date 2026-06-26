package Array_Questions.Manipulation_Prob;

public class AlternativeManner {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length, i = 0, j = n - 1;

        while (i <= j) {
            if (i == j) {
                System.out.println(arr[i]);
                return;
            } else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }

        }

    }
}
