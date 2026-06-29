package Array_Questions.Manipulation_Prob;

public class Pivot_Index {
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        int n = arr.length;
        int PivotIndex = 0;
        int leftSum[] = new int[n]; 
        int rightSum[] = new int[n]; 

        //fill left sum wala array
        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i-1] + arr[i];
        }
        //fill right sum wala array
        rightSum[n-1] = arr[n-1];
        for (int i = n-2; i >=0; i--) {
            rightSum[i] = rightSum[i+1] + arr[i];
        }
        //check for equality
        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i]) {
               PivotIndex = i;
            }
        }
        System.out.println(PivotIndex);
        
    }
}
