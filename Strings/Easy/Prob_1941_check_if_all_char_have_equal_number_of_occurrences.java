package Strings.Easy;

public class Prob_1941_check_if_all_char_have_equal_number_of_occurrences {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        int count = 0;
        for(int i=0; i<26; i++){
            if(freq[i] > 0){
                count = freq[i];
                break;
            }
        }

        for(int i=0; i<26; i++){
            if(freq[i] > 0 && freq[i] != count){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prob_1941_check_if_all_char_have_equal_number_of_occurrences solution = new Prob_1941_check_if_all_char_have_equal_number_of_occurrences();
        String s = "abacbc";
        boolean result = solution.areOccurrencesEqual(s);
        System.out.println("All characters have equal number of occurrences: " + result);
    }
}
