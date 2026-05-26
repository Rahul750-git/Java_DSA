package Methods;

public class Non_void {
    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }

    public static void main(String[] args) {
        int result = add(12, 13);
        System.out.println(result);
    }
}
