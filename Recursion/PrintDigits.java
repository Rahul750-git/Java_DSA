package Recursion;

public class PrintDigits {
    static void printdigit(int num){
        if(num == 0){
            return;
        }
        int digits = num % 10;
        num = num / 10;
        printdigit(num);
        System.out.println(digits);
    }
    public static void main(String[] args) {
        int num = 1378;
        printdigit(num);
    }
}
