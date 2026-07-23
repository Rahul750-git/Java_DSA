package Searching_Algorithms.Binary_Search.TwoD_Matrix;

public class RowWithMaximumOnes {

    static int getFirstOccIndex(int mat[][], int rowIndex) {
        int totalRow = mat.length;
        int totalCol = mat[0].length;
        int ans = totalCol;
        if (mat[rowIndex][totalCol - 1] == 0) {
            return totalCol;
        } else {
            int s = 0;
            int e = totalCol - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (mat[rowIndex][mid] == 0) {
                    s = mid + 1;
                } else {
                    ans = mid;
                    e = mid - 1;
                }
            }
        }
        return ans;
    }

    public static int rowAndMaximumOnes(int[][] mat) {
        int totalRow = mat.length;
        int totalCol = mat[0].length;
        int maxi = Integer.MIN_VALUE;
        int maxRow = Integer.MIN_VALUE;
        for (int row = 0; row < totalRow; row++) {
            int firstOccIndex = getFirstOccIndex(mat, row);
            int oneCount = totalCol - firstOccIndex;
            if (oneCount > maxi && oneCount != 0) {
                maxi = oneCount;
                maxRow = row;
            }

        }
        return maxRow;
    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 0, 1 }, { 0, 0, 1, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 } };
        int ans = rowAndMaximumOnes(mat);
        System.out.println(ans);
    }
}
