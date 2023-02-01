import java.util.Arrays;

public class SearchIn2DArray {
      public static void main(String[] args) {
        int[][] arr = {
            {15,12,13,14,15,16,17},
            {25,27,28,29,30,31,32,33},
            {48,43,41,42,43,49}
        };
        int target = 29;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(findmax(arr));
        System.out.println(Integer.MAX_VALUE);
    }
    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int findmax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] element : arr) {
            for (int element2 : element) {
                if (element2 > max){
                    max =  element2;
                }
            }
        }
        return max;
    }
    
}
