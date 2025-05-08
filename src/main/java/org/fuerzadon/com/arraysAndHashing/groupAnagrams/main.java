package org.fuerzadon.com.arraysAndHashing.groupAnagrams;

public class main {
    public static void main(String[] args) {

        String words[] = {"act","pots","tops","cat","stop","hat"};
        String words2[] = {"x"};
        String words3[] = {""};

        System.out.println(methods.groupAnagrams(words));
        System.out.println(methods.groupAnagrams(words2));
        System.out.println(methods.groupAnagrams(words3));
    }
}
