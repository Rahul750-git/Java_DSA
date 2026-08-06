package Recursion;

public class PrintMyName {
    static void PrintName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n+" Rahul");
        PrintName(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        PrintName(n);
    }

}
