package org.fuerzadon.com.arraysAndHashing.twoSum;

import java.util.HashMap;

public class methods {

    //Complejidad o(n^2)
    public static int[] twoSum(int[] nums, int target) {
        if(nums.length<2){
            return new int[0];
        }

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i]+nums[j]==target)){
                    return new int [] {i, j};
                }
            }
        }
        return new int[0];
    }


    // Complejidad O(n)
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if(prevMap.containsKey(diff)){
                return new int [] {prevMap.get(diff), i};
            }

            prevMap.put(num, i);

        }
        return new int [] {};
    }

}
