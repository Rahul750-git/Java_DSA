package Array_Questions.ProblemSolving_Arr;

public class MaxEle {
    public static void main(String[] args) {
        int arr[] = { 9, 2, 15, 17, 12 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
          
        }
        System.out.println(max);
    }
}
