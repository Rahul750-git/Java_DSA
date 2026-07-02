package Array_Questions.Multi_Dimensional_Array;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        if (arr == null || arr.length == 0) {

        }
        // for original array
        int totalRow = arr.length;
        int totalCol = arr[0].length;

        // new array
        int newtotalRow = totalCol;
        int newtotalCol = totalRow;
        int ans[][] = new int[newtotalRow][newtotalCol];

        // actual logic
        for (int i = 0; i < totalRow; i++) {
            for (int j = 0; j < totalCol; j++) {
                ans[j][i] = arr[i][j];
            }

        }
        for (int i = 0; i < ans[0].length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
