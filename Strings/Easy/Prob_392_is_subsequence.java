package Strings.Easy;

public class Prob_392_is_subsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        Prob_392_is_subsequence solution = new Prob_392_is_subsequence();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = solution.isSubsequence(s, t);
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\"? " + result);
    }
}
