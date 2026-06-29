package Array_Questions.Manipulation_Prob;

import java.util.HashMap;

public class RepeatFirstElement {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 4, 3, 5, 10 };
        int freqFirstEle = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i : arr) {
            if (freq.get(i) > 1) {
                freqFirstEle = i;
            }
        }
        System.out.println(freqFirstEle);
    }
}
