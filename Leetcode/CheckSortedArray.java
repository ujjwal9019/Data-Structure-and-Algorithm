package Leetcode;
// LC =  https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

public class CheckSortedArray {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Check if the current element is greater than the next element
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            
            // If there is more than one break, return false
            if (count > 1) {
                return false;
            }
        }
        
        return true;
    }
}

    
}
