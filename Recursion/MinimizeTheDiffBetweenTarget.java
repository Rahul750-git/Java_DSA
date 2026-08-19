package Recursion;

public class MinimizeTheDiffBetweenTarget {
    static int solve(int sum, int target, int mat [][],int row){
  
         if (row >= mat.length) {
            return Math.abs(target - sum);
         }
          int mini = Integer.MAX_VALUE;

          for(int num: mat[row]){
            int ans = solve(sum + num, target, mat, row + 1);
            mini = Math.min(ans, mini);
          }
          return mini;
    }

    public static int MinimizeTheDifferenceBetween(int target , int mat[][]){
        int row = 0;
        int sum = 0;
        int ans = solve(sum, target, mat, row);
        return ans;
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 13;
        int ans = MinimizeTheDifferenceBetween(target, mat);
        System.out.println(ans);
    }
}
