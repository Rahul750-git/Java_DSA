package Array_Questions.Manipulation_Prob;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {5,6,0,2,4,1,8,7};
        int n = arr.length;
        int xorSum = 0;

        for (int num : arr) {
            xorSum = xorSum ^ num;
        }
        for (int i = 0; i <=n; i++) {
            xorSum = xorSum ^ i;
        }
        System.out.println(xorSum);
    }

}
