public class FindMin {
    public static void main(String[] args) {
        int[] arr = {45,65,865,412,8,96,96,41,35,72};
        System.out.println("ans: "+ findMin(arr));
    }
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
