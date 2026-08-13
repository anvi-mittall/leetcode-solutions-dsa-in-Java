package Arrays.lec_2_medium;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Prob_56_Merge_Intervals {
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();

        for(int[] interval : intervals){
            if(ans.isEmpty() || interval[0] > ans.get(ans.size() - 1)[1]){
                ans.add(interval);
            }else{
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String args[]){
        Prob_56_Merge_Intervals s = new Prob_56_Merge_Intervals();
        int[][] intervals = {{1,5}, {3,6}, {8,10}, {15,18}};
        System.out.println(s.merge(intervals));
    }
}
