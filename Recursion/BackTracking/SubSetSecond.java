package Recursion.BackTracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetSecond {
     static void solve(int nums[], int index, List<Integer> output, List<List<Integer>> ans) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        int currVal = nums[index];
        output.add(currVal);
        solve(nums, index + 1, output, ans);
        output.remove(output.size() - 1);
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        solve(nums, index + 1, output, ans);
    }

    public static List<List<Integer>> SubSet(int nums[]) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, index, output, ans);
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2 };
        List<List<Integer>> ans = SubSet(nums);
        System.out.println(ans);

    } 
}
