package org.fuerzadon.com.arraysAndHashing.containsDuplicates;

import java.util.*;

public class methods {


    // O(n^2)
    public static boolean hasDuplicate(int[] nums) {
        if(nums.length<=1)
            return false;

        List<Integer> duplicates = new ArrayList<>();
        for(int n : nums){
            if(duplicates.contains(n)){
                return true;
            }
            duplicates.add(n);
        }
        return false;
    }

    // O(n)
    public static boolean hasDuplicateStreams(int[] nums){
        return Arrays
                .stream(nums)
                .distinct()
                .count() < nums.length;
    }

    //O(n)
    public static boolean hasDuplicate2(int [] nums){
        Set<Integer> seen = new HashSet<>();

        for(int num : nums ){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }

}
