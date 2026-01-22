class Solution {
    public boolean check(int[] nums) {
       int n=nums.length;
        int dropcount=0;
        boolean check=true;
       for(int i=0;i<n;i++){
        int next=(i+1) % n;
        if(nums[i]>nums[next]){
            dropcount++;
        }
        if(dropcount>1){
            check=false;
        }
       }
       return check;
    }
}