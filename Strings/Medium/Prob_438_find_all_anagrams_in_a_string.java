package Strings.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob_438_find_all_anagrams_in_a_string {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if(s.length() < p.length()){
            return ans;
        }

        int[] freqP = new int[26];
        int[] freqS = new int[26];

        // p ki frequency
        for(int i=0; i<p.length(); i++){
            freqP[p.charAt(i) - 'a']++;
        }

        // s ka first window
        for(int i=0; i<p.length(); i++){
            freqS[s.charAt(i) - 'a']++;
        }

        // first window check
        if(Arrays.equals(freqP, freqS)){
            ans.add(0);
        }
        
        // window slide
        for(int i=p.length(); i<s.length(); i++){

            // new character add
            freqS[s.charAt(i) - 'a']++;

            // old character remove
            freqS[s.charAt(i - p.length()) - 'a']--;

            // frequency same hai toh starting index add
            if(Arrays.equals(freqP, freqS)){
                ans.add(i - p.length() + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Prob_438_find_all_anagrams_in_a_string solution = new Prob_438_find_all_anagrams_in_a_string();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = solution.findAnagrams(s, p);
        System.out.println("Starting indices of anagrams: " + result);
    }
}
