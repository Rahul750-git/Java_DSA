package Recursion;

public class MaxElement {
    static void maxEle(int arr[], int maxi, int i) {
        if (arr.length >= 0) {
            return;
        }
        if (arr[i] > maxi) {
            maxi = arr[i];
           System.out.println(maxi);
            
        }
     
        maxEle(arr, maxi, i + 1);
            
    }

   public static void main(String[] args) {
    int arr[] = {10,20,30,40,50,60,70};
    int maxi = Integer.MIN_VALUE;
    int i = 0;
     maxEle(arr, maxi, i);
   }
}
