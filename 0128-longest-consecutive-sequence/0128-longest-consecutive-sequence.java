class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxLength=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int longest=1;
            
            while(set.contains(currentNum+1)){
                currentNum++;
                longest++;
            }
            maxLength=Math.max(maxLength,longest);
            }
        }
        return maxLength;
    }
   
   
}