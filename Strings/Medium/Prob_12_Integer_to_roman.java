package Strings.Medium;

public class Prob_12_Integer_to_roman {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String ans = "";

        for(int i=0; i<values.length; i++){
            while(num >= values[i]){
                ans += symbols[i];
                num -= values[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Prob_12_Integer_to_roman solution = new Prob_12_Integer_to_roman();
        int num = 1994;
        String romanNumeral = solution.intToRoman(num);
        System.out.println("Integer: " + num + " -> Roman Numeral: " + romanNumeral);
    }
}
