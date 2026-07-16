package Searching_Algorithms.Binary_Search;

public class Painter_Partition {
    static boolean isValid(int boards[], int k, int maxPage) {
        int painterCount = 1;
        int paintedLength = 0;
        for (int i = 0; i < boards.length; i++) {
            if (paintedLength + boards[i] <= maxPage) {
                paintedLength = paintedLength + boards[i];
            } else {
                painterCount++;
                paintedLength = 0;
                if (painterCount > k || boards[i] > maxPage) {
                    return false;
                } else {
                    paintedLength = paintedLength + boards[i];
                }
            }

        }
        return true;
    }

    public static int minTime(int[] boards, int k) {
        // code here
        int sum = 0;
        for (int i = 0; i < boards.length; i++) {
            sum += boards[i];
        }
        int ans = -1;
        int s = 0;
        int e = sum;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValid(boards, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int boards[] = { 5, 10, 30, 20, 15 };
        int k = 3;
        int ans = minTime(boards, k);
        System.out.println(ans);
    }
}
