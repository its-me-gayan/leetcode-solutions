package test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 6/22/24
 * Time: 11:34 PM
 */
public class test {
    public static void main(String[] args) {
        String name = "Gayan Sanjeewa";

        String reversedName = "";
        for (int i = name.toCharArray().length-1; i >= 0; i--) {
            reversedName+=name.toCharArray()[i];
        }
        System.out.println(reversedName);


        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());


        Stack<String> stack = new Stack<>();
        for (int i = 0; i < name.toCharArray().length; i++) {
            stack.push(String.valueOf(name.toCharArray()[i]));
        }
        while (stack.iterator().hasNext()){
            System.out.print(stack.pop());
        }

    }
}
