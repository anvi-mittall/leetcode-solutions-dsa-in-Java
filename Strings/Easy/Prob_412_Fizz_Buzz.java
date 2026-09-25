package Strings.Easy;

import java.util.ArrayList;
import java.util.List;

public class Prob_412_Fizz_Buzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                list.add("Fizz");
            }
            else if(i % 5 == 0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Prob_412_Fizz_Buzz solution = new Prob_412_Fizz_Buzz();
        int n = 15;
        List<String> result = solution.fizzBuzz(n);
        System.out.println("FizzBuzz result: " + result);
    }
}
