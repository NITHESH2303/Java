import java.util.Scanner;
import java.util.Arrays;


public class SearchInStrings{

    public static void main(String[] args) {
    //     String name = "Nithesh";
    //     char target = 's';
    //     System.out.println(search(name, target));
    //     System.out.println(Arrays.toString(name.toCharArray()));
    // }
    // static boolean search(String str, char target) {
    //     if (str.length() == 0)
    //         return false;
        
    //     for (int i = 0; i < str.length(); i++){
    //         if (target ==str.charAt(i)){
    //             return true;
    //         }
    //     }
    //     return false;

    int[] arr = {1,2,3,4,5,6,7,8,9,0};
    System.out.println(min(arr));

    }

    static int min ( int[] arr ) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
            
    }

}