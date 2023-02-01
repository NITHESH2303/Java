import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1,0};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
    static void sort(int[] arr,int left,int right ){
            if (left >= right)
                return;
            int s = left;
            int e = right;
            int m = e - (e - s)/2;
            int pivot = arr[m];

            while (s <= e){
                while (arr[s] < pivot){
                    s++;
                }
                while (arr[e] > pivot){
                    e--;
                }
                if(s<=e){
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    s++;
                    e--;
                }
                sort(arr, left, e);
                sort(arr, s, left);
            }
    }
}
