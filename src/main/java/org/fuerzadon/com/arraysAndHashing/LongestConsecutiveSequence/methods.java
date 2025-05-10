package org.fuerzadon.com.arraysAndHashing.LongestConsecutiveSequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class methods {

    public static int longestConsecutive(int[] nums){

        if(nums.length==0){
            return 0;
        }

        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .sorted()
                .collect(Collectors.toList());


        if(list.size()==1){
            return 1;
        }

        int consecutive = 0, maxC=0;
        for(int i=0; i<list.size()-1; i++){
            if((list.get(i)+1 == list.get(i+1))){
                if(consecutive==0){
                    consecutive+=2;
                }else{
                    consecutive+=1;
                }
            }else{
                if(consecutive>0){
                   maxC=Math.max(maxC, consecutive) ;
                   consecutive = 0;
                }
            }
        }

        if(consecutive>=0){
            maxC=Math.max(maxC, consecutive) ;
        }

        return maxC;
    }

    public static int longestConsecutive2(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }
        int longest = 0;

        for(int num : numSet){
            if(!numSet.contains(num-1)){
                int length = 1;

                while(numSet.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest, length);

            }
        }
        return longest;
    }

}
