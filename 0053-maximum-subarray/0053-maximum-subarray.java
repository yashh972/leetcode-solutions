import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currentSum=nums[0];
        int maxSum=nums[0];

        for(int i=1;i<n;i++){
            currentSum=Math.max(nums[i],nums[i]+currentSum);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}