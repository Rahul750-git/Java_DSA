package Array_Questions.ProblemSolving_Arr;

import java.util.Arrays;
public class SwapAlternateEle {
    static void SwapAlternate_ele(int arr[]) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        SwapAlternate_ele(arr);
        System.out.println(Arrays.toString(arr));

    }
}
