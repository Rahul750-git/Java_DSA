package ProblemSolving_Arr;

public class FindAvg {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 3 };
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int size = arr.length;
        double Avg = sum / size;
        System.out.println(Avg);
    }
}
