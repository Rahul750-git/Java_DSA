package Searching_Algorithms.Binary_Search;

public class BookAllocation {
    static boolean isValid(int[] nums, int k, int maxPage) {
        int studentCount = 1;
        int page = 0;
        for (int i = 0; i < nums.length; i++) {
            if (page + nums[i] <= maxPage) {
                page = page + nums[i];
            } else {
                studentCount++;
                if (studentCount > k || nums[i] > maxPage) {
                    return false;
                } else {
                    page = 0;
                    page = page + nums[i];
                }
            }

        }
        return true;
    }

    static int findPages(int[] nums, int k) {
        // code here
        int n = nums.length;
        int s = 1;
        int sum = 0;
        if (n < k) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int e = sum;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValid(nums, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int nums[] = {12, 34, 67, 90};
        int k = 2;
        int ans = findPages(nums,k);
        System.out.println(ans);
    }
}
