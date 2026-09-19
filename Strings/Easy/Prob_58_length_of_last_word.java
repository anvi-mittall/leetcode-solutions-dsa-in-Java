package Strings.Easy;

public class Prob_58_length_of_last_word {
    public int lengthOfLastWord(String s){
        int n = s.length();
        int i = n - 1;

        while(i >= 0 && s.charAt(i) == ' '){
          i--;
        }

        int count = 0;
        while(i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        Prob_58_length_of_last_word solution = new Prob_58_length_of_last_word();
        String s = "Hello World";
        int result = solution.lengthOfLastWord(s);
        System.out.println("The length of the last word in \"" + s + "\" is: " + result);
    }
}
