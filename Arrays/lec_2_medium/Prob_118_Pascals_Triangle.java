package Arrays.lec_2_medium;

import java.util.ArrayList;
import java.util.List;

public class Prob_118_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    int value = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    row.add(value);
                }
            }
            ans.add(row);
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_118_Pascals_Triangle s = new Prob_118_Pascals_Triangle();
        int numRows = 5;
        List<List<Integer>> result = s.generate(numRows);
        System.out.println(result);
    }
}
