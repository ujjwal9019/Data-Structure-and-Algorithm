package Recursion;

public class Reverse {

    private static void reverseArrayHelper(int i, int n, int[] arr) {
        if (i >= n / 2) {
            return;  // Base case: when i reaches the middle of the array
        }
        
        // Swap the elements
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        
        // Recursive call for the next element
        reverseArrayHelper(i + 1, n, arr);
    }
    
    public static void main(String[] args) {
        
        int [] arr  = {1,2,3,4,5,6,7,8,9,0};
        reverseArrayHelper(0, arr.length, arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
