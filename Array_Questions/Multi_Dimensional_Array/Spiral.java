package Array_Questions.Multi_Dimensional_Array;

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = arr.length;
        int m = arr[0].length;
        List<Integer> result = new ArrayList<>();

        int StartRow = 0;
        int endRow = n - 1;
        int StartCol = 0;
        int endCol = m - 1;

        while (StartRow <= endRow && StartCol <= endCol) {
            // row wise left to right -> startingRow print krni h , from Startingcol to
            // endingcol
            for (int col = StartCol; col <= endCol; col++) {
                result.add(arr[StartRow][col]);
            }
            StartRow++;

            // col wise top to bottom -> ending col print karna h, from starting row to
            // ending row
            for (int row = StartRow; row <= endRow; row++) {
                result.add(arr[row][endCol]);
            }
            endCol--;
            // row wise right to left -> ending row print krni h,
            //  from ending col to starting col
            for (int col = endCol; col >= StartCol; col--) {
                result.add(arr[endRow][col]);
            }
            endRow--;
            // col wise bottom to top -> starting col print krni h, 
            // from ending row to
            // starting row
            for (int row = endRow; row >= StartRow; row--) {
                result.add(arr[row][StartCol]);
            }
            StartCol++;
        }
        System.out.println(result);
    }
}
