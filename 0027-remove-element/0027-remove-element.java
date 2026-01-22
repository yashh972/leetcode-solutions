class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int k=n-1;
        int i=0;
        while(i<=k){
            if(nums[i]==val){
                swap(nums,i,k);
                k--;
            }
            if(nums[i]!=val){
                i++;
            }
        }
        return k+1;
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}