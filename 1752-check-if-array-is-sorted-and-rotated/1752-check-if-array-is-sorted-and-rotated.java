class Solution {
    public boolean check(int[] nums) {
        int n =nums.length;
        int dropcount=0;
        for(int i =0;i<n;i++){
            int next=(i+1)%n;
            if(nums[next]<nums[i]){
                dropcount++;
            }
        }
        return dropcount<=1;
    }
}