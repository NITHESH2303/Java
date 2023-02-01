import java.util.*;

public class recursion {
    public static void main(String[] args) {
    //     System.out.println(fibo(4));
        for (int i = 0; i <=50; i++) {
        System.out.println( i + " : " +FiboForm(i));
        }
    // }
    // static int fibo(int i){
    //     if(i<2)
    //         return i;
    //     return fibo(i-1) + fibo(i-2);
    // int[] arr = {2,5,7,9,11,15,20};
    // int target =2; 
    // System.out.println(search(arr,0,arr.length -1, target));
    // }
    // static int search(int [] arr, int start, int end,int target){
    //     if (start> end){
    //         return -1;
    //     }
    //     int mid = start +  (end - start) / 2;
    //     if (arr[mid] == target){
    //         return mid;
    //     }
    //     if (arr[mid] < target){
    //         return search(arr,mid +1, end,target);           
    //     }
    //     return search(arr,start,mid -1,target);
    
    }
    static long FiboForm(long n ){
        return (long)((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
