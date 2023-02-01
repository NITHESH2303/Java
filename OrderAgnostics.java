
public class OrderAgnostics {
    public static void main(String[] args) {
        //int[] arr = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] arr = {15, 14, 13, 12 ,11, 10 ,9,8,7,6,5,4,3,2,1,0};
        int target = 10;
        int ans = orderAgnosticsBS(arr, target);
        System.out.println(ans); 
        
    }
    static int orderAgnosticsBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start]< arr[end];        
        while(start <= end){
            int mid = (start/2 + end/2);
            if (target == arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else{
                if (target > arr[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        
        }
        return -1;
    }
}

