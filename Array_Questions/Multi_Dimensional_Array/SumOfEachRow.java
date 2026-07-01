package Array_Questions.Multi_Dimensional_Array;

import java.util.ArrayList;
import java.util.List;

public class SumOfEachRow {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = arr.length;
        int m = arr[0].length;
        List<Integer> list = new ArrayList<>();
        // traversal
        for (int i = 0; i < n; i++) {
            // jaise hi main kisi nayi row me aauga
            // walse hi maine sum ko zero kar dunga
            int sum = 0;

            for (int j = 0; j < m; j++) {
                int value = arr[i][j];
                sum = sum + value;
            }
            list.add(sum);

        }
        System.out.println(list);

    }
}
