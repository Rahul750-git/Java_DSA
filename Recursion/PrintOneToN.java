package Recursion;

public class PrintOneToN {
    static void print_One_To_N(int n, int count){
        if(n < count){
            return;
        }
        System.out.print(count + ",");
        print_One_To_N(n ,count + 1);
    }
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        print_One_To_N(n,count);
    }
}
