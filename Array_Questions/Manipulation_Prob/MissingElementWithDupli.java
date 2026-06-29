package Array_Questions.Manipulation_Prob;

import java.util.ArrayList;
import java.util.List;

public class MissingElementWithDupli {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 7, 7 };
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);
            int pos = value - 1;
            // mark kardo ye position
            if (arr[pos] > 0) {
                arr[pos] = -arr[pos];
            }
        }
        // travel array and wherever you encounter a positive value, print the number at
        // the same time
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }
        System.out.println(ans);
    }
}
