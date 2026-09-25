package Strings.Easy;

public class Prob_520_detect_capital {
    public boolean detectCapitalUse(String word) {
        int count = 0;

        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }

        if(count == word.length()){
            return true;
        }

        if(count == 0){
            return true;
        }

        if(count == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Prob_520_detect_capital solution = new Prob_520_detect_capital();
        String word = "USA";
        boolean result = solution.detectCapitalUse(word);
        System.out.println("Is the capital usage correct? " + result);
    }
}
