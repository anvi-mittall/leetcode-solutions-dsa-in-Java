package Arrays.lec_1_easy;

public class Prob_2011_Final_value_of_variable_after_performing_operations {
    public int finalValueAfterOperations(String[] operations){
        int X = 0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                X++;
            }else{
                X--;
            }
        }
        return X;
    }

    public static void main(String args[]){
        Prob_2011_Final_value_of_variable_after_performing_operations s = new Prob_2011_Final_value_of_variable_after_performing_operations();
        String[] operations = {"--X","X++","X++"};
        System.out.println(s.finalValueAfterOperations(operations));
    }
}
