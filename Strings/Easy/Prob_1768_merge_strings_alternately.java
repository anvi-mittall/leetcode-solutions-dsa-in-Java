package Strings.Easy;

public class Prob_1768_merge_strings_alternately {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        String ans = "";
        int i = 0;

        while(i<m && i<n){
            ans = ans + word1.charAt(i);
            ans = ans + word2.charAt(i);
            i++;
        }

        while(i<m){
            ans = ans + word1.charAt(i);
            i++;
        }

        while(i<n){
            ans = ans + word2.charAt(i);
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Prob_1768_merge_strings_alternately solution = new Prob_1768_merge_strings_alternately();
        String word1 = "abc";
        String word2 = "pqr";
        String result = solution.mergeAlternately(word1, word2);
        System.out.println("Merged string: " + result);
    }
}
