package Array;

public class Multiply_totalElement {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50,60,70};
    
       int n = arr.length;
       int total = 1;
       for (int i = 0; i < n; i++) {
        int value = arr[i];
        total =  total * value;
        // result  = total * i;
       }
       System.out.println(total);
    }
}