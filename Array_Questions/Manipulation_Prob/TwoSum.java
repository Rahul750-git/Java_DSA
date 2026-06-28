package Array_Questions.Manipulation_Prob;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 5, 4, 6 };
        int target = 11 ,sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    sum = arr[i] + arr[j];
                }
            }
        }
        System.out.println(sum);

    }

}
