package Bit_Manipulation.Easy;

public class Prob_67_Add_binary {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i>=0  || j>=0 || carry>0){
            int sum = carry;

            if(i>=0){
                sum += a.charAt(i) - '0'; // converts string into integer
                i--;
            }

            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }

            if(sum == 0){
                ans.append('0');
                carry = 0;
            }
            else if(sum == 1){
                ans.append('1');
                carry = 0;
            }
            else if(sum == 2){
                ans.append('0');
                carry = 1;
            }
            else{
                ans.append('1');
                carry = 1;
            }
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        Prob_67_Add_binary solution = new Prob_67_Add_binary();

        String a = "1010";
        String b = "1011";

        String result = solution.addBinary(a, b);
        System.out.println("Sum of binary strings: " + result); // Output: 10101
    }
}
