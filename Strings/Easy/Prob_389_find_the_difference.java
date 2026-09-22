package Strings.Easy;

public class Prob_389_find_the_difference {
    public char findTheDifference(String s, String t) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0; i<s.length(); i++){
            freq1[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++){
            freq2[t.charAt(i) - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]){
                return (char)(i + 'a');
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        Prob_389_find_the_difference solution = new Prob_389_find_the_difference();
        String s = "abcd";
        String t = "abcde";
        char result = solution.findTheDifference(s, t);
        System.out.println("The extra character in t: " + result);
    }
}
