package Strings.Medium;

public class Prob_647_palindromic_substrings {
    public int countSubstrings(String s) {
        int count = 0;

        for(int i=0; i<s.length(); i++){
            // odd length palindrome
            int left = i;
            int right = i;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }

            // even length palindrome
            left = i;
            right = i + 1;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Prob_647_palindromic_substrings solution = new Prob_647_palindromic_substrings();
        String s = "abc";
        int result = solution.countSubstrings(s);
        System.out.println("Number of palindromic substrings: " + result);
    }
}
