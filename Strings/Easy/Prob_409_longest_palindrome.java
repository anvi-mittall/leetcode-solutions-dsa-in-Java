package Strings.Easy;

public class Prob_409_longest_palindrome {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }

        int count = 0;
        boolean odd = false;

        for(int i=0; i<128; i++){
            count += (freq[i]/2) * 2;

            if(freq[i] % 2 == 1){
                odd = true;
            }
        }

        if(odd){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Prob_409_longest_palindrome solution = new Prob_409_longest_palindrome();
        String input = "abccccdd";
        int result = solution.longestPalindrome(input);
        System.out.println("The length of the longest palindrome that can be built is: " + result);
    }
}
