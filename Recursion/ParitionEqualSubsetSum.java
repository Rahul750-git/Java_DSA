package Recursion;


public class ParitionEqualSubsetSum {

    static boolean solve(int target, int index,int []nums){
        if(target == 0){
            return true;
        }
        if(target < 0){
            return false;
        }
        if (index >= nums.length) {
            return false;
        }

        //include ka 
        boolean includeKaAns = solve(target - nums[index], index + 1, nums);
        boolean excludeKaAns = solve(target, index + 1, nums);

        return includeKaAns || excludeKaAns;
    }
    public static boolean canParition(int []nums){
        int sum = 0;
        for(int num:nums){
            sum += num;
        }

        if((sum & 1)==1){
            return false;
        }
        int index = 0;
        int target = sum/2;

        boolean ans = solve(target, index, nums);
        return ans;

    }
    public static void main(String[] args) {
        int nums[] = {1,5,11,5};
        boolean ans = canParition(nums);
        System.out.println(ans);
    }
}