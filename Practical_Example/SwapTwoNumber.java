package Practical_Example;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("A ki Value :" + a);
        System.out.println("B ki Value :" + b);
    }

}
