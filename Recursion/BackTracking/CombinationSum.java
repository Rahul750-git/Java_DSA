package Recursion.BackTracking;

import java.util.*;

public class CombinationSum {

    static void solve(int candisates[], int target, List<List<Integer>> ans, List<Integer> output, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }
        if (index >= candisates.length) {
            return;
        }
        if (target < 0) {
            return;
        }
        output.add(candisates[index]);
        solve(candisates, target - candisates[index], ans, output, index);
        output.remove(output.size() - 1);
        solve(candisates, target, ans, output, index + 1);
    }

    public static List<List<Integer>> combinationsum(int candisates[], int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(candisates, target, ans, output, index);
        return ans;
    }

    public static void main(String[] args) {
        int candisates[] = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> ans = combinationsum(candisates, target);
        System.out.println(ans);
    }
}