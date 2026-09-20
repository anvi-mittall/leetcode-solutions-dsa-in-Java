package Contests.con_520;

public class number_of_intersecting_intervals_pairs_I{
    public int countIntersectingIntervals(int[][] intervals) {
        int count = 0;
        int n = intervals.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(intervals[i][0] <= intervals[j][1] && 
                   intervals[j][0] <= intervals[i][1]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        number_of_intersecting_intervals_pairs_I solution = new number_of_intersecting_intervals_pairs_I();
        int[][] intervals = {{1, 3}, {2, 4}, {5, 6}, {7, 8}};
        int result = solution.countIntersectingIntervals(intervals);
        System.out.println("Number of intersecting interval pairs: " + result);
    }
}