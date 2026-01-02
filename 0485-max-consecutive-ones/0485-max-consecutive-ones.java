class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxStreak=0;
        int currentStreak=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            }
            else{
                currentStreak=0;
            }

        }
        return maxStreak;
        
    }
}