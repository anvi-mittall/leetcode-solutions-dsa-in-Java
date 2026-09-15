package Binary_Search.BS_on_2D_Arrays;

public class Prob_1901_find_a_peak_element_II {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = rows - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            int col = 0;
            for(int j=0; j<cols; j++){
                if(mat[mid][j] > mat[mid][col]){
                    col = j;
                }
            }

            int up = (mid - 1 >= 0) ? mat[mid-1][col] : -1;
            int down = (mid + 1 < rows) ? mat[mid+1][col] : -1;

            if(mat[mid][col] > up && mat[mid][col] > down){
                return new int[]{mid,col};
            }

            if(up > mat[mid][col]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Prob_1901_find_a_peak_element_II solution = new Prob_1901_find_a_peak_element_II();
        int[][] mat = {
            {1, 4, 3},
            {6, 5, 2}
        };
        int[] result = solution.findPeakGrid(mat);
        System.out.println("Peak element found at: [" + result[0] + ", " + result[1] + "]");
    }
}
