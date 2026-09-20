package Strings.Easy;

public class Prob_771_jewels_and_stones {
    public int numJewelsInStones(String jewels, String stones) {
        int n = stones.length();
        int count = 0;

        for(int i=0; i<n; i++){
            if(jewels.contains(String.valueOf(stones.charAt(i)))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Prob_771_jewels_and_stones solution = new Prob_771_jewels_and_stones();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = solution.numJewelsInStones(jewels, stones);
        System.out.println("Number of jewels in stones: " + result);
    }
}
