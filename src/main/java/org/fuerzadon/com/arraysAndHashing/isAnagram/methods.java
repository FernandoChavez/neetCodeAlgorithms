package org.fuerzadon.com.arraysAndHashing.isAnagram;

import java.util.HashMap;

public class methods {


    //COMPLEJIDAD O(n^2)
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        StringBuilder t2 = new StringBuilder(t);
        char[] chars = s.toCharArray();

        for(char c : chars){
            int i = t2.indexOf(String.valueOf(c));
            if(i != -1){
                t2.replace(i, i+1, "");
            }
        }

        return (t2.length()==0 ?true:false);
    }

    //COMPLEJIDAD O(n)

    public static boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return countS.equals(countT);
    }


}
