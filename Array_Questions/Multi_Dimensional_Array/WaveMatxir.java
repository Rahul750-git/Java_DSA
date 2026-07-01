package Array_Questions.Multi_Dimensional_Array;

import java.util.ArrayList;
import java.util.List;

public class WaveMatxir {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    result.add(arr[j][i]);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    result.add(arr[j][i]);
                }
            }
        }
        System.out.println(result);
    }

}
