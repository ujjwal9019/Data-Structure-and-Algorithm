package Leetcode;



public class RotateanArray {

// Brute force
    
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Adjust k if it is greater than n

        // Step 1: Store the last k elements in a temporary array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Step 2: Shift the rest of the elements to the right
        for (int j = n - k - 1; j >= 0; j--) {
            nums[j + k] = nums[j];
        }

        // Step 3: Place the stored elements at the beginning of the array
        for (int m = 0; m < k; m++) {
            nums[m] = temp[m];
        }
    }
}
