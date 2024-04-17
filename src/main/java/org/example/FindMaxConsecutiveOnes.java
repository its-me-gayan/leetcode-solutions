package org.example;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 4/7/24
 * Time: 10:25 PM
 */
public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 8, 7, 8, 3, 1, 1, 1, 1, 1};
        int numbers = findMaxConsecutiveOnes(arr);
        System.out.println(numbers);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        int index = 0;
        for (int num : nums) {
            if (num == 1) {
                Integer i1 = hashtable.get(index);
                if (i1 != null && i1 >= 0) {
                    hashtable.put(index, ++i1);
                } else {
                    hashtable.put(index, 1);
                }
            } else {
                index++;
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        Enumeration<Integer> elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            arrayList.add(elements.nextElement());
        }
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            max = arrayList.get(i);
            for (Integer integer : arrayList) {
                if (max < integer) {
                    max = integer;
                }
            }
        }
        return max;
    }
}
