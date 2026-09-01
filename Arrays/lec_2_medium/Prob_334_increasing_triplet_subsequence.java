package Arrays.lec_2_medium;

public class Prob_334_increasing_triplet_subsequence {
    public boolean increasingTriplet(int[] nums){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <= first){
                first = num;
            } else if(num <= second){
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        Prob_334_increasing_triplet_subsequence s = new Prob_334_increasing_triplet_subsequence();
        int[] nums = {1,2,3,4,5};
        System.out.println(s.increasingTriplet(nums));
    }
}