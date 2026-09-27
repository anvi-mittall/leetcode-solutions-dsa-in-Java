package Strings.Easy;

public class Prob_1108_defanging_an_IP_address {
    public String defangIPaddr(String address) {
        char[] arr = address.toCharArray();
        String ans = "";

        for(int i=0; i<arr.length; i++){
            if(arr[i] == '.'){
                ans = ans + "[.]";
            }else{
                ans = ans + arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Prob_1108_defanging_an_IP_address solution = new Prob_1108_defanging_an_IP_address();
        String address = "1.1.1.1";
        String result = solution.defangIPaddr(address);
        System.out.println("Defanged IP address: " + result);
    }
}
