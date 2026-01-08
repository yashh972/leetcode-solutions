class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxLength=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int longest=1;   
                while(set.contains(currentNum +1)){
                currentNum++;
                longest++;  
            }
              maxLength=Math.max(maxLength,longest);
            }
          
        }    
        return maxLength;
    }
   
}