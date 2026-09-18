package Strings.Easy;

public class Prob_242_valid_anagram {
    public boolean isAnagram(String s, String t){
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq1[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            freq2[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prob_242_valid_anagram solution = new Prob_242_valid_anagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result = solution.isAnagram(s, t);
        System.out.println("Are \"" + s + "\" and \"" + t + "\" anagrams? " + result);
    }
}
