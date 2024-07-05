package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 5/17/24
 * Time: 5:37 PM
 */
public class FindSubStrings {
    public static void main(String[] args) {

        int a = findSubstrings("bcada");
        System.out.println(a);
    }

    public static int findSubstrings(String s) {
        int length = s.length();
        int count = 0;
        Set<Character> charSet = new HashSet<>();

        for (int j = 2; j <= length; j++) {
            for (int i = 0; i <= length - j; i++) {
                String substring = s.substring(i, i + j);
                if (!hasDuplicateChars(substring, charSet)) {
                    count++;
                }
            }
        }

        return count + length;
    }

    public static boolean hasDuplicateChars(String string, Set<Character> charSet) {
        charSet.clear();
        for (char c : string.toCharArray()) {
            if (!charSet.add(c)) {
                return true;
            }
        }
        return false;
    }
}
