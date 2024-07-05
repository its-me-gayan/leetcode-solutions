package org.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 5/26/24
 * Time: 1:57 PM
 */
public class ListSort {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 100; i++) {
            myList.add(ran.nextInt(100));
        }

        System.out.println("Before sorting the array => "+Arrays.toString(myList.toArray()));

    int temp = 0;
        for (int i = 0; i < myList.size(); i++) {
            int i1 = myList.get(i);
            for (int j = 0; j < myList.size(); j++) {
                int i11 = myList.get(j);
                if(i1 < i11){
                    temp = i1;
                    i1 = i11;
                    myList.set(i , i1);
                    myList.set(j , temp);

                }
            }
        }
//        myList.sort(Comparator.reverseOrder());
//        List<Integer> collect = myList.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("After sorting the array => "+Arrays.toString(myList.toArray()));

    }

}
