package Recursion;

public class JumpGame {
    static boolean solve (int nums[], int index){
        if (index == nums.length-1) {
            return true;
        }
        if (index >= nums.length) {
            return false;
        }
        if (nums[index] == 0) {
            return false;
        }
        int jumpVal = nums[index];
                    boolean overallAns = false;
        for (int jump = 1; jump <= jumpVal; jump++) {
            boolean recAns = solve(nums, index + jump);
            overallAns = overallAns || recAns;
        }
        return overallAns;

    }
    public static boolean jumpgame(int nums[]){
        int index = 0;
        boolean ans = solve(nums, index);
        return ans;
    }
    public static void main(String[] args) {
        int nums[] ={2,3,1,1,4};
        boolean ans = jumpgame(nums);
        System.out.println(ans);
    }
}
