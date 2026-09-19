package Strings.Easy;

public class Prob_415_add_strings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();
        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;
            if(i >= 0){
                sum += num1.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                sum += num2.charAt(j) - '0';
                j--;
            }

            ans.append(sum % 10);
            carry = sum/10;
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        Prob_415_add_strings solution = new Prob_415_add_strings();
        String num1 = "123";
        String num2 = "456";
        String result = solution.addStrings(num1, num2);
        System.out.println("The sum of \"" + num1 + "\" and \"" + num2 + "\" is: " + result);
    }
}
