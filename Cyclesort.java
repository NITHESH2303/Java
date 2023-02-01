import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Cyclesort {
    public static void main(String[] args) {
        int arr [] = {5,3,4,2,6,7,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int [] arr) {
        int i =0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    //     for(int i =0 ; i< arr.length ; i++){
    //         int correct = arr[i] - 1;
    //         if(arr[i]!=arr[correct]){
    //             swap(arr,i,correct);
    //         }
    //     }
     }
    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
         arr[first] = arr[last];
         arr[last] = temp;  
    }
    
}
