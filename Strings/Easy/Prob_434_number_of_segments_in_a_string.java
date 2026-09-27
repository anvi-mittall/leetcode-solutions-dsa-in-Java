package Strings.Easy;

public class Prob_434_number_of_segments_in_a_string {
    public int countSegments(String s) {
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' ' && (i==0 || s.charAt(i-1) == ' ')){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Prob_434_number_of_segments_in_a_string solution = new Prob_434_number_of_segments_in_a_string();
        String s = "Hello, my name is John";
        int result = solution.countSegments(s);
        System.out.println("Number of segments in the string: " + result);
    }
}
