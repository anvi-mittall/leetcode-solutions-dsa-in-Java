package Strings.Easy;

public class Prob_387_find_unique_character_in_a_string{
    public int firstUniqChar(String s){
        int n = s.length();
        int[] freq = new int[26];

        for(int i = 0; i < n; i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < n; i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Prob_387_find_unique_character_in_a_string solution = new Prob_387_find_unique_character_in_a_string();
        String s = "leetcode";
        int result = solution.firstUniqChar(s);
        System.out.println("The index of the first unique character in \"" + s + "\" is: " + result);
    }
}