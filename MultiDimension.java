import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int[][] arr = new int[3][3];
            System.out.println(arr.length);

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = inp.nextInt();
                }
            }

            //  for (int i = 0; i < arr.length; i++) {
            // //     for (int j = 0; j < arr[i].length; j++) {
            // //         System.out.print(arr[i][j] + " ");
            // //     }
            // //     System.out.println();
            //     System.out.println(Arrays.toString(arr[i]));
            //  }
            

             for(int[] a: arr) {
                 System.out.println(Arrays.toString(a));
             }
        }

    }
}