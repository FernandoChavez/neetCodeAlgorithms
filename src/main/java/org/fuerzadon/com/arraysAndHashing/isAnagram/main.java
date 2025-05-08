package org.fuerzadon.com.arraysAndHashing.isAnagram;

public class main {
    public static void main(String[] args) {
        String w1="amor", w2 = "roma", w3="lamina", w4="anima";
        System.out.println(w1+" y "+w2+" son anagramas? "+ methods.isAnagram2(w1, w2));
        System.out.println(w3+" y "+w4+" son anagramas? "+ methods.isAnagram2(w3, w4));
    }
}
