package Arrays.lec_1_easy;

public class Prob_1512_number_of_good_pairs {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        Prob_1512_number_of_good_pairs s = new Prob_1512_number_of_good_pairs();
        int[] nums = {1,2,3,1,1,3};
        System.out.println(s.numIdenticalPairs(nums));
    }
}
