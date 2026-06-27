package Array_Questions.Manipulation_Prob;

public class FindUniqueEle {
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,5,3,4};
        int XorSum = 0;
        for(int num : arr){
            XorSum = XorSum ^ num;
        }
        System.out.println(XorSum);
    }
}
