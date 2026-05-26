package Methods;

public class callByValue {
    static void solve(int num) {
        System.out.println(" inside function " + num);
        num = num * 10;
        System.out.println("inside function " + num);

    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println( " inside main "+num);
        solve(20);
        System.out.println( " inside main "+num);
    }

}
