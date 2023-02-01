import java.util.*;

public class Selectionsort {
    public static void main(String[] args){
        Integer arr [] = {7,4,9,5,2,1,6,0,8,3};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    // static void selection(Integer[] arr) {
    //     for(int i =0 ; i < arr.length ; i++) {
    //         int last = arr.length - i - 1;
    //         //List<Integer> list = Arrays.asList(arr);
    //         //int max = Collections.max(list);
    //         int Max_ind =maxi(arr,0,last);
    //         swap(arr,Max_ind,last);          
    //    }

	// }
    public static void swap(Integer[] arr, int max, int last) {
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }
    private static int maxi(Integer[] arr, int start, int end){
        int max = start;
        for(int i = start ; i < end ; i++) { 
            if(arr[i]>=arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void selection(Integer[] arr,int r,int c,int max){
        if(r==0)
            return;
        else{
            if(c<r){
                if (arr[c]>arr[max]){
                    selection(arr,r,c+1,c);
                }else{
                    selection(arr,r,c+1,max);
                }
            }else  {
                int temp = arr[max];
                arr[max] = arr[r-1];
                arr[r-1] = temp;
                selection(arr,r-1,0,0);
            }
        }
    }
}

    

