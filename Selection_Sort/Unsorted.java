package Selection_Sort;

public class Unsorted {
    public static void main(String[] args) {
        int arr[] = {6,5,3,1};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int s : arr){
            System.out.println(s);
        }
    }
}
