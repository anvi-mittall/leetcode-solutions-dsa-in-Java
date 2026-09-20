package Contests.con_519;

public class prob_4052_cyclically_shift_rows_and_columns {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        int[][] temp = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int newCol = (j- rowShift[i] + n)% n;
                temp[i][newCol] = grid[i][j];
            }
        }

        int[][] ans = new int[n][n];
        for(int j=0; j<n; j++){
            for(int i=0; i<n; i++){
                int newRow = (i - colShift[j] + n) % n;
                ans[newRow][j] = temp[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        prob_4052_cyclically_shift_rows_and_columns solution = new prob_4052_cyclically_shift_rows_and_columns();
        int n = 3;
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] rowShift = {1, 0, 2};
        int[] colShift = {0, 1, 1};

        int[][] result = solution.cyclicShift(n, grid, rowShift, colShift);

        System.out.println("Result after cyclically shifting rows and columns:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
