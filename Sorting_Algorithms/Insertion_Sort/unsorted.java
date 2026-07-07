package Sorting_Algorithms.Insertion_Sort;

public class unsorted {
  public static void main(String[] args) {
    int arr[] = {1,4,5,2,3};
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int curr = i;
        int prev = i-1;
        int curValue =arr[i];
        while (prev>=0&&curValue<arr[prev]) {
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev + 1] = curValue;
    }
    for(int m : arr){
        System.out.print(m +" ");
    }
  }
}
    

