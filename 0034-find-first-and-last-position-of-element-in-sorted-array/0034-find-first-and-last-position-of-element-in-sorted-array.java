class Solution {
    
    private int lowerBound(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid=0;
        int ans=n;

        while(low<=high){
            mid=low +(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
    }

     private int upperBound(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid=0;
        int ans=n;

        while(low<=high){
            mid=low +(high-low)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int ub=upperBound(nums,target)-1;
        int lb=lowerBound(nums,target);
        if(lb<=ub && ub<n && nums[lb]==target){
            return new int[]{lb,ub};
        }
        return new int[]{-1,-1};
        
    }
}