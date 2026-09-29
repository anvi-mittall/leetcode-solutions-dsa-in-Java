package Strings.Easy;

public class Prob_13_Roman_to_integer {
    public int romanToInt(String s) {
        int sum = 0;

        for(int i=0; i<s.length(); i++){
            int value = 0;

            if(s.charAt(i) == 'I'){
                value = 1;
            }else if(s.charAt(i) == 'V'){
                value = 5;
            }else if(s.charAt(i) == 'X'){
                value = 10;
            }else if(s.charAt(i) == 'L'){
                value = 50;
            }else if(s.charAt(i) == 'C'){
                value = 100;
            }else if(s.charAt(i) == 'D'){
                value = 500;
            }else if(s.charAt(i) == 'M'){
                value = 1000;
            }

            if(i+1 < s.length()){
                int next = 0;

                if(s.charAt(i+1) == 'I'){
                    next = 1;
                }else if(s.charAt(i+1) == 'V'){
                    next = 5;
                }else if(s.charAt(i+1) == 'X'){
                    next = 10;
                }else if(s.charAt(i+1) == 'L'){
                    next = 50;
                }else if(s.charAt(i+1) == 'C'){
                    next = 100;
                }else if(s.charAt(i+1) == 'D'){
                    next = 500;
                }else if(s.charAt(i+1) == 'M'){
                    next = 1000;
                }

                if(value < next){
                    sum -= value;
                }else{
                    sum += value;
                }
            }else{
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Prob_13_Roman_to_integer solution = new Prob_13_Roman_to_integer();
        String s = "MCMXCIV";
        int result = solution.romanToInt(s);
        System.out.println("Roman numeral " + s + " is converted to integer: " + result);
    }
}
