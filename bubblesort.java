import java.util.*;

public class bubblesort {
    public static void main(String[] args)  {
    int [] arr = {4,6,3,8,2,5,1,9,0,7};
    bubble(arr,arr.length-1,0);
    System.out.println(Arrays.toString(arr));
    }

    // static void bubble(int [] arr){
    //     boolean swap;
    //     for(int i=0; i<arr.length; i++){
    //         swap = false;
    //         for(int j=1; j<arr.length - i; j++){
    //             if(arr[j]<arr[j-1]){
    //                 int temp = arr[j];
    //                 arr [j] = arr[j-1];
    //                 arr[j-1] = temp;
    //                 swap = true;
    //             }
    //         }
    //         if(!swap)
    //             break;
    //     }
    // }
    static void bubble(int[] arr,int r,int c) {
        if (r==0)
            return;
        if (c<r) {
            if(arr[c]<arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr,r,c+1);  
        }
        else
            bubble(arr,r-1,0);
    }
}