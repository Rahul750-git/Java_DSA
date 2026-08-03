package Recursion;

public class PrintHello {
    static void printHello(int n ){
        if(n == 0){
            return ;
        }
        System.out.println( n +" Hello");
        printHello(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
         printHello(n);
    }
}
