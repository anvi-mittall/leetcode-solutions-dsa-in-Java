package Strings.Medium;

public class Prob_8_string_to_integer_atoi {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        // 1. Leading spaces ignore
        while(i<n && s.charAt(i) == ' '){
            i++;
        }

        // 2. Sign check
        int sign = 1;

        if(i<n && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(i<n && s.charAt(i) == '+'){
            i++;
        }

        // 3. Number banana
        int num = 0;

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            // 4. Integer overflow check
            if(num > (Integer.MAX_VALUE - digit)/10){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }
            num = num * 10 + digit;
            i++;
        }
        // 5. Sign lagakar return
        return num * sign;
    }

    public static void main(String[] args) {
        Prob_8_string_to_integer_atoi solution = new Prob_8_string_to_integer_atoi();
        String s = "   -42";
        int result = solution.myAtoi(s);
        System.out.println("The integer representation of \"" + s + "\" is: " + result);
    }
}
