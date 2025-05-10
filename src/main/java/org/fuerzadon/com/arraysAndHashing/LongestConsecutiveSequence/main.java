package org.fuerzadon.com.arraysAndHashing.LongestConsecutiveSequence;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int nums[] = {2,20,4,10,3,4,5} , nums2[] = {0,3,2,5,4,6,1,11}, nums3[] = {1,1,2,1,1,1 },
                nums4[] = {5,1,66,0,65,67,3}, nums5[] = {0,3,5,7,9,10}, nums6[] = {0,3,5,7,9,10, 11},
                nums7[] = { 0,3,5,7,9 };

        System.out.println(methods.longestConsecutive2(nums));
        System.out.println(methods.longestConsecutive2(nums2));
        System.out.println(methods.longestConsecutive2(nums3));
        System.out.println(methods.longestConsecutive2(nums4));
        System.out.println(methods.longestConsecutive2(nums5));
        System.out.println(methods.longestConsecutive2(nums6));
        System.out.println(methods.longestConsecutive2(nums7));

    }
}
