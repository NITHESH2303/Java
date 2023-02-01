public class SearchInRange{
    public static void main(String[] args){
        int[] arr = {1,2,3,78,4,54,5,5,8};
        int target = 4;
        System.out.println(linearSearch(arr, target,1,9));
    }



static int linearSearch(int[] arr, int target, int start, int end){
    if(arr.length ==0){
        return -1;
    }

    for (int index = start; index  <= end; index++){
        int element = arr[index];
        if (element == target){
            return index;
        }
    }
    return -1;
    }
}
