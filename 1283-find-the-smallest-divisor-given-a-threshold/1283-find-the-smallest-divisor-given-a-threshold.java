class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=max(nums);
        while(low<=high){
            int mid=low+(high-low)/2;

            if(sumByDivisor(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
    private int max(int[] nums){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
             ans=Math.max(ans,nums[i]);
        }
        return ans;
    }
    private int sumByDivisor(int nums[],int divisor){
        int sum=0;
        int n=nums.length;
        for(int i=0;i<=n-1;i++){
        sum=sum +(nums[i]+divisor-1)/divisor;
        }
        return sum;
    }
    
   
}