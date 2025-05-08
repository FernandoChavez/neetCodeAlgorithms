package org.fuerzadon.com.arraysAndHashing.containsDuplicates;

public class main {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5, 5};
        int [] nums2 = {1,2,3,4,5};
        System.out.println("Tiene numeros repetidos? "+methods.hasDuplicate2(nums));
        System.out.println("Tiene numeros repetidos usando streams? "+methods.hasDuplicateStreams(nums2));

    }
}
