package Arrays.lec_1_easy;

public class Prob_66_Plus_one {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newResult = new int[n + 1];
        newResult[0] = 1;
        return newResult;
    }

    public static void main(String[] args) {
        Prob_66_Plus_one solution = new Prob_66_Plus_one();
        int[] digits = {1, 2, 3};
        int[] result = solution.plusOne(digits);
        System.out.println(java.util.Arrays.toString(result));
    }
}
