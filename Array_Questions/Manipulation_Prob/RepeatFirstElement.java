package Array_Questions.Manipulation_Prob;

public class RepeatFirstElement {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 4, 3, 5, 10 };
        int repfirst = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repfirst = arr[i];
                }
            }
        }
        System.out.println(repfirst);
    }
}
