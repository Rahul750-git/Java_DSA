package ProblemSolving_Arr;

public class SumPostiveAndNegtive {
    public static void main(String[] args) {
        int arr[] = { 2, -3, 5, -7, 8 };
        int posSum = 0;
        int negSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posSum = posSum + arr[i];
            } else {
                negSum = negSum + arr[i];
            }
        }
        System.out.println("Postive Sum : " + posSum);
        System.out.println("Negtive sum : " + negSum);

    }
}
