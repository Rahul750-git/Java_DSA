package Array_Questions.ProblemSolving_Arr;

public class MultiplyBYTen {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 12 };
        int size = arr.length;
        int newArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            int ele = arr[i];
            int newEle = ele * 10;
            newArray[i] = newEle;
            System.out.print(newArray[i] + " ");
        }

    }
}
