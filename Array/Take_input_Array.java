package Array;

import java.util.Scanner;

public class Take_input_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        // input in array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Provide input for index: " + i);
            arr[i] = sc.nextInt();
        }

        // print in array
        for (int i : arr) {
            System.out.println(i);
        }

    }

}
