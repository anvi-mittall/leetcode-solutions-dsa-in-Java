package Strings.Medium;

import java.util.Arrays;

public class Prob_567_permutation_in_string {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }

        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];

        for(int i=0; i<s1.length(); i++){
            freqS1[s1.charAt(i) - 'a']++;
        }

        for(int i=0; i<s1.length(); i++){
            freqS2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freqS1, freqS2)){
            return true;
        }

        for(int i=s1.length(); i<s2.length(); i++){
            freqS2[s2.charAt(i) - 'a']++;

            freqS2[s2.charAt(i - s1.length()) - 'a']--;

            if(Arrays.equals(freqS1, freqS2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Prob_567_permutation_in_string solution = new Prob_567_permutation_in_string();
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean result = solution.checkInclusion(s1, s2);
        System.out.println("Does s2 contain a permutation of s1? " + result);
    }
}
