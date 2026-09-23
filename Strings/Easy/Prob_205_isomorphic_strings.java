package Strings.Easy;

public class Prob_205_isomorphic_strings {
    public boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i=0; i<s.length(); i++){
            int a = s.charAt(i);
            int b = t.charAt(i);

            if(map1[a] != map2[b]){
                return false;
            }
            map1[a] = i+1;
            map2[b] = i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        Prob_205_isomorphic_strings solution = new Prob_205_isomorphic_strings();
        String s = "egg";
        String t = "add";
        boolean result = solution.isIsomorphic(s, t);
        System.out.println("Are the strings isomorphic? " + result);
    }
}
