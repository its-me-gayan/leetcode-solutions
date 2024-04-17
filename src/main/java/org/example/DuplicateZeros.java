package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 4/7/24
 * Time: 9:52 PM
 */
public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,3,0,4,5,0};
        System.out.println("before : "+Arrays.toString(arr));
        duplicateZeros(arr);
        System.out.println("after : "+Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int val : arr) {
            if (val == 0) {
                arrayList.add(val);
                arrayList.add(val);
            } else {
                arrayList.add(val);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayList.get(i);
        }

    }
}
