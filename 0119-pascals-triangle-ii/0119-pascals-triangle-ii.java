class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> getRow = new ArrayList<>();

        long  ans=1;
        getRow.add(1);

        for(int i=1;i<=rowIndex;i++){
            ans=ans*(rowIndex-i+1)/i;
            
            getRow.add((int)ans);
        }
        return getRow;
    }   
}