package Binary_Search.BS_on_2D_Arrays;

public class Prob_74_search_a_2D_matrix{
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows * cols - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            int row = mid/cols;
            int col = mid % cols;

            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Prob_74_search_a_2D_matrix solution = new Prob_74_search_a_2D_matrix();
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        boolean result = solution.searchMatrix(matrix, target);
        System.out.println(result); // Output: true
    }
}