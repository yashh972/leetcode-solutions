class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        

        while(left<right){
            if(nums[left]%2==0){
                left++;
            }
            else if(nums[right]%2!=0){
                right--;
            }
            else{
                swap(nums,left,right);
                left++;
                right--;
            }

        }
        return nums;
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}