package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 5/5/24
 * Time: 10:46 PM
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] num = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSumMethod1(num, 6)));
        System.out.println(Arrays.toString(twoSumMethod2(num, 6)));

    }
    public static int[] twoSumMethod1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j && ((nums[i] + nums[j]) == target)) {
                        return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSumMethod2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return null;
    }
}
