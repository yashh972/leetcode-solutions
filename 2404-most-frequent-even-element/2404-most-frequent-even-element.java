class Solution {
    public int mostFrequentEven(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]%2==0){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       }
       int maxFreq=0;
       int answer=-1;
       for(int key:map.keySet()){
        int freq=map.get(key);
        if(freq>maxFreq || (key<answer && freq==maxFreq)){
            maxFreq=freq;
            answer=key;
        }
       }
       return answer;
    }
}