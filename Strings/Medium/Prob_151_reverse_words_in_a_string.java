package Strings.Medium;

public class Prob_151_reverse_words_in_a_string {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            reversed.append(words[i]);
            if(i != 0){
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Prob_151_reverse_words_in_a_string solution = new Prob_151_reverse_words_in_a_string();
        String input = "  the sky   is blue  ";
        String result = solution.reverseWords(input);
        System.out.println("Reversed words: \"" + result + "\"");
    }
}
