package Strings.Easy;

public class Prob_709_to_lower_case {
    public String toLowerCase(String s) {
        s = s.toLowerCase();
        return s;
    }

    public static void main(String[] args) {
        Prob_709_to_lower_case solution = new Prob_709_to_lower_case();
        String input = "Hello World!";
        String result = solution.toLowerCase(input);
        System.out.println("Lowercase string: " + result);
    }
}
