class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=max(nums);

        while(low<=high){
            int mid=low +(high-low)/2;

            if(sumbyDivisor(nums,mid)<=threshold){
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
    private int sumbyDivisor(int[] nums ,int div){
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=(sum + (nums[i] + div - 1) / div);
        }
        return sum;
    }
}