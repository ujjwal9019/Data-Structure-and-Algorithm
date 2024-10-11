package Leetcode;

public class MoveZero {
    public static void main(String[] args) {
       int [] nums  = {1,0,3,5,0}; 
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
