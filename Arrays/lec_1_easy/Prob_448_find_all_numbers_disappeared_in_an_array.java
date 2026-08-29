package Arrays.lec_1_easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Prob_448_find_all_numbers_disappeared_in_an_array {
    public List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Prob_448_find_all_numbers_disappeared_in_an_array solution = new Prob_448_find_all_numbers_disappeared_in_an_array();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = solution.findDisappearedNumbers(nums);
        System.out.println(result);
    }
}
