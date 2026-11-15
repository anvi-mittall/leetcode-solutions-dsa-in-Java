package Bit_Manipulation.Easy;

public class Prob_231_Power_of_two {
    public boolean isPowerOfTwo(int n) {
        if(n>0 && (n&(n-1)) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Prob_231_Power_of_two solution = new Prob_231_Power_of_two();

        int n = 16;

        boolean result = solution.isPowerOfTwo(n);
        System.out.println(n + " is a power of two: " + result); // Output: true
    }
}
