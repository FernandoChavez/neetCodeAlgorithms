package org.fuerzadon.com.arraysAndHashing.groupAnagrams;


import java.util.*;

public class methods {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<String> words = new ArrayList<>(Arrays.asList(strs));
        List<List<String>> groups = new ArrayList<>();
        Deque<Integer> indexes = new ArrayDeque<>();

        while(words.size()>1) {
            List<String> g = new ArrayList<>();
            indexes.push(0);
            g.add(words.get(0));
            for (int i = 1; i < words.size(); i++) {
                if (isAnagram(words.get(0), words.get(i))) {
                    g.add(words.get(i));
                    indexes.push(i);
                }
            }
            groups.add(g);

            while(!indexes.isEmpty()) {
                int index = indexes.poll();
                words.remove(index);
            }
        }

        if(words.size()==1){
            groups.add(words);
        }

        return groups;
    }


    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT= new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i), 0)+1);

        }

        return countS.equals(countT);
    }

}
