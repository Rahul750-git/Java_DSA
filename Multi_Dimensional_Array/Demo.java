

public class Demo {

    public static void main(String[] args) {
        // decalartion
        // int arr[][];
        // // allocation
        // arr = new int[3][3];

        // init
        int brr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // print 2D array for manualiy
        // System.out.println(brr[0][0]);

          // print 2D array for loop
          for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[i].length; j++) {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
          }
    }
}
