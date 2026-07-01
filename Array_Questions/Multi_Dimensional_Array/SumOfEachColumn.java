package Array_Questions.Multi_Dimensional_Array;

import java.util.ArrayList;
import java.util.List;

public class SumOfEachColumn {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = arr[0].length;
        int m = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int k = 0; k < arr.length; k++) {
                int value = arr[k][i];
                sum += value;
            }
            list.add(sum);
        }
        System.out.println(list);
    }
}
