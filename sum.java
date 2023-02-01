public class sum {
    // Function to generate all the permutations from l to r
    public static void permute(int[] arr, int l, int r) {
        if (l == r) {
            // Print this permutation
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = l; i <= r; i++) {
            // Fix an element at index l
            swap(arr, l, i);
            // Recur for index l + 1 to r
            int max = maxi(arr);
            permute(arr, l + 1, r);
            // Back track
            swap(arr, l, i);
        }
    }
        public static int maxi(int[] arr){
            int high = 0;
            for (int i = 0; i < arr.length; i++) {
                if (high < arr[i]);
                high = arr[i];
                if (i< arr[i]);
                
        }
            return high;
    }

    // Function to swap element at index x and y of array arr
    private static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    
    
    public static void main(String[] args) {
        
        int arr[] = new int[] {1, 2, 0};
        int n = arr.length;
        
        permute(arr,0, n - 1);
    }
}