package Leetcode;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {9,8,6,5,4,3,2,1};
        int n=nums.length;
        int sum=0;
        int  sum1=0;
        for(int i=0;i<=n;i++)
        {
            sum+=i;
        }
        for(int j=0;j<n;j++)
        {
            sum-=nums[j];
        }
    System.out.println(sum);
    }
}
