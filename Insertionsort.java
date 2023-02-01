import java.util.*;

public class Insertionsort {
    public static void main(String[] args) {
        int [] arr = {5,3,6,2,8,1,0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1 + i; j> 0 ; j--) {
                if (arr[j] < arr[j-1]) 
                    swap(arr,j, j-1);
                else
                    break;
            }
        }
    }
    static void swap(int [] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
}
