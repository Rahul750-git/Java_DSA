package Array_Questions.ProblemSolving_Arr;

public class SearchEle {

    static boolean findTarget(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 9, 7 };
        boolean ans = findTarget(arr, 7);
        System.out.println(ans);

    }
}
