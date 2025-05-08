package org.fuerzadon.com.arraysAndHashing.twoSum;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int [] array = {1,4,3,2,5}, array2 = {1,4,2}, array3 = {1};
        int target = 6, target2 = 7, target3=19;

        System.out.println("Numeros que sumen " + target+":" + Arrays.toString(methods.twoSum2(array, target)));
        System.out.println("Numeros que sumen " + target2+":" + Arrays.toString(methods.twoSum2(array2, target)));
        System.out.println("Numeros que sumen " + target3+":" + Arrays.toString(methods.twoSum2(array3, target3)));
    }
}
