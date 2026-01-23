class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        List<int[]> ans=new ArrayList<>();
        if (n==0) {
            return new int[0][0];
        }
        Arrays.sort(intervals,(a,b) ->a[0] - b[0]);
        int[] current=intervals[0];
    
        for(int i=1;i<n;i++){
            int[] next=intervals[i];
            if(next[0]<=current[1]){
                
               current[1] = Math.max(current[1], next[1]);

            }
            else{
                ans.add(current);
                current=next;
                
            }
        }
        ans.add(current);
        return ans.toArray(new int [ans.size()][]);
    }
}