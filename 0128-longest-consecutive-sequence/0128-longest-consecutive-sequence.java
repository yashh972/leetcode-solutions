class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        int maxLength=0;
        int longest=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num :set){
        if(!set.contains(num-1)){
            longest=1;
            int currentNum=num;
        
        while(set.contains(currentNum+1)){
            longest++;
            currentNum++;
        }
        }
        maxLength=Math.max(maxLength,longest);
        }
        return maxLength;
    } 
}