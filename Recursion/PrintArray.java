package Recursion;


public class PrintArray {

    static void printarray(int []arr,int i){
        if (arr.length <= i) {
            return;
        }
      if (arr[i] == 0) {
        System.out.println(arr[i]);
      }
      System.out.println(arr[i]);
      printarray(arr,i + 1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int i = 0;
         printarray(arr,i);
    }
    
} 