package interview;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "Sadder";
        String s2 = "Dreads";
        boolean res = isAnagram(s1,s2);
        System.out.println(res);
    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        String p1 = s1.toLowerCase();
        String p2 = s2.toLowerCase();

        char[]w1 = p1.toCharArray();
        char[]w2 = p2.toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);

        for (int i = 0; i< w1.length;i++){
            if(w1[i]!=w2[i]){
                return false;
            }
        }
        return true;
    }
}
