package Linear_Search;

public class FindElement {
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,9,4};
        int n = arr.length;
        int target = 9;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("true");
            }
        }
    }
}
