package Binary_Search.BS_on_Answers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prob_4_median_of_two_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            ans.add(nums1[i]);
        }

        for(int i=0; i<n; i++){
            ans.add(nums2[i]);
        }

        Collections.sort(ans);
        int size = ans.size();

        if (size % 2 != 0) {
            return ans.get(size / 2);
        }

        // Even
        else {
            return (ans.get(size / 2 - 1) + ans.get(size / 2)) / 2.0;
        }
    }
    
    public static void main(String[] args) {
        Prob_4_median_of_two_sorted_arrays solution = new Prob_4_median_of_two_sorted_arrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}
