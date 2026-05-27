package Array;

public class find_minValue {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, -2, -7, 8, -9 };
        int min = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }

        }
        System.out.println(min);
    }

}
