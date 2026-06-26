package Array_Questions.ProblemSolving_Arr;

public class CountZeroesAndOnes {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 1, 0, 1 };
        int countZero = 0;
        int countOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else {
                countOnes++;
            }
        }
        System.out.println("Zeroes count is : " + countZero);
        System.out.println("Ones count is : " + countOnes);
    }

}
