package Bit_Manipulation.Easy;

public class Prob_191_number_of_one_bits {
    public int hammingWeight(int n) {
        int count = 0;

        while(n>0){
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        Prob_191_number_of_one_bits solution = new Prob_191_number_of_one_bits();
        int n = 11; // Example input
        int result = solution.hammingWeight(n);
        System.out.println("Number of one bits in " + n + ": " + result);
    }
}
