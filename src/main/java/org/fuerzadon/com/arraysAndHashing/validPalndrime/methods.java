package org.fuerzadon.com.arraysAndHashing.validPalndrime;

public class methods {
    public static boolean isPalindrome(String s) {
        //O(n)
        char []s2 = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : s2){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        int size = sb.length();
        for(int i = 0; i<size/2; i++){
            if(sb.charAt(i)!= sb.charAt(size-1-i)){
                return false;
            }
        }
        return true;
    }

    //O(n)
    public static boolean isPalindrome2(String s) {
        StringBuilder newStr = new StringBuilder();
        for(char c :  s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }

        return newStr.toString().equals(newStr.reverse().toString());
    }
}
