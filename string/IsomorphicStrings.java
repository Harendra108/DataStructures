package practice.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxz";

        boolean isIsomorphic = isIsomorphic(s1, s2);

        System.out.println(isIsomorphic);
    }

    private static boolean isIsomorphic(String s1, String s2) {
        if(s1 == null && s2 == null){
            return true;
        }
        if((s1 == null || s2 == null) || (s1.length() != s2.length())) {
            return false;
        }
        Map<Character, Character> map =new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            if(map.containsKey(s1.charAt(i))) {
                if(s2.charAt(i) != map.get(s1.charAt(i))) {
                    return false;
                }
            } else {
                map.put(s1.charAt(i), s2.charAt(i));
            }
        }

        return true;
    }
}
