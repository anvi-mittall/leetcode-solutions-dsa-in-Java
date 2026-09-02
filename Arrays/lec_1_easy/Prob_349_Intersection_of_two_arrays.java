package Arrays.lec_1_easy;

import java.util.HashSet;
import java.util.Set;

public class Prob_349_Intersection_of_two_arrays {
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int num : nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }

        int[] ans = new int[set2.size()];
        int k = 0;
        for(int num : set2){
            ans[k] = num;
            k++;
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_349_Intersection_of_two_arrays s = new Prob_349_Intersection_of_two_arrays();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = s.intersection(nums1, nums2);
        System.out.println(java.util.Arrays.toString(ans));
    }
}
