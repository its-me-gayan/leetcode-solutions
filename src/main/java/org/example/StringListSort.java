package org.example;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 5/26/24
 * Time: 2:57 PM
 */
public class StringListSort {
    public static void main(String[] args) {
        String baseString = "zyujkmncvbxacv";
        char[] charArray = baseString.toCharArray();
        String finalString = "";
            char temp;

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if(charArray[i] < charArray[j]){
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        for (int i = 0; i <charArray.length ; i++) {
            finalString+=charArray[i];
        }
        System.out.println("approach one");
        System.out.println("before sort - " + baseString);
        System.out.println("after sort - " + finalString);

        int[] ints = {1,2,3,4,5,6,7,8,9,9};


        String collect1 = baseString
                .chars()
                .mapToObj(value -> (char) value).toList()
                .stream()
                .sorted(Comparator.naturalOrder())
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println("approach two");
        System.out.println("before sort - " + baseString);
        System.out.println("after sort - " + collect1);
    }
    protected static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 2) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();

    }
}
