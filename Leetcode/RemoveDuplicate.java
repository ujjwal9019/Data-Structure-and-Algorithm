package Leetcode;

public class RemoveDuplicate {
    
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
    
            int uniqueCount = 1; // Start with the first element as unique
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) { // Check if the current element is different from the last unique one
                    nums[uniqueCount] = nums[i]; // Place the unique element at the next position
                    uniqueCount++;
                }
            }
            return uniqueCount; // Return the count of unique elements
        }
        
    
    
}
