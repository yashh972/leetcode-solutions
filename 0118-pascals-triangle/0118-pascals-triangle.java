import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            triangle.add(list(i));
        }
        return triangle;

    }
    private List<Integer> list(int rowIndex){
        List<Integer> list=new ArrayList<>();
        long ans=1;
        list.add((int)ans);

        for(int i=1;i<=rowIndex;i++){
            ans=ans*(rowIndex-i+1)/i;
            list.add((int)ans);
        }
        return list;
    }
}