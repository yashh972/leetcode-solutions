import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            triangle.add(generateRow(i));
        }   

        return triangle;
    }
    private List<Integer> generateRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    long ans = 1;

    row.add(1);

    for (int i = 1; i <= rowIndex; i++) {
        ans = ans * (rowIndex - i + 1) / i;
        row.add((int) ans);
    }

    return row;
}
}