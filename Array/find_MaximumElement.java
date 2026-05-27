package Array;

public class find_MaximumElement {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, -5, 40, 50, 60 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
