

public class Multiply {
    public static void main(String[] args) {
        int arr[][] = { { 10, 20 }, { 40, 50 } };
        int multi = 1;
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               int value = arr[i][j];
                multi =   multi * value;
            }
        }
        System.out.println(multi);
    }
    
}
