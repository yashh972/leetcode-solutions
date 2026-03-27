class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long low=1;
        long high=maxElement(piles);

        while(low<=high){
            long mid=low + (high-low)/2;

            long totalHours=totalHours(piles,(int)mid);

            if(totalHours<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return (int) low;
        
    }
    private int maxElement(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
             max=Math.max(nums[i],max);
        }
        return max;
    }
    private long totalHours(int[] nums,int speed){
        long totalHours=0;
        for(int i=0;i<nums.length;i++){
            totalHours+=(nums[i]+speed-1)/speed;
        }
        return totalHours;

    }
}