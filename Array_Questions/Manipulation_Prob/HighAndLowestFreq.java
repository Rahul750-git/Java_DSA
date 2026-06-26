package Array_Questions.Manipulation_Prob;

import java.util.HashMap;

public class HighAndLowestFreq {

    static int getMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // for (int i : freq.keySet()) {
        // System.out.println(i + "->" + freq.get(i));
        // }
        int maxFreq = -1;
        int maxFreqWaliKey = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);
            if (currentKeyKiFrequency > maxFreq) {
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }
        return maxFreqWaliKey;
    }

    static int[] getHighestAndLowestFreqElement(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestnum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestnum = currentKey;
            }
        }
        int ans[] = { highestNum, lowestnum };
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5 };
        // int ans = getMode(arr);
        // System.out.println(ans);
        int ans[] = getHighestAndLowestFreqElement(arr);
        System.out.println("Highest freq wala num :" + ans[0]);
        System.out.println("Lowest freq wala num :" + ans[1]);

    }
}
