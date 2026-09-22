package Strings.Easy;

public class Prob_1903_largest_odd_number_in_a_string{
    public String largestOddNumber(String num) {
        int n = num.length();

        for(int i= n-1; i >= 0; i--){
            int digit = num.charAt(i) - '0';
            if(digit % 2 != 0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Prob_1903_largest_odd_number_in_a_string solution = new Prob_1903_largest_odd_number_in_a_string();
        String num = "123456";
        String result = solution.largestOddNumber(num);
        System.out.println("Largest odd number in the string: " + result);
    }
}