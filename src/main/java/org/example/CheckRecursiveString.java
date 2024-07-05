package org.example;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 7/5/24
 * Time: 11:12 PM
 */
public class CheckRecursiveString {


    public static void main(String[] args) {
//        String s = "aaaabbbb"; //true
//        String s = "aaaabbbba"; //false
//        String s = "aaaaa"; //true
//        String s = "b"; //true
//        String s = "ab"; //true
        String s = "bbbabb"; //false
        boolean recursiveString = checkRecursiveString(s);
        System.out.println(recursiveString);
    }

    public static boolean checkRecursiveString(String s){

        if(!s.contains("a")){
            return true;
        }
        if(!s.contains("b")){
            return true;
        }
        char[] charArray = s.toCharArray();
        char c = charArray[0];
        for (int i = 1; i < charArray.length; i++) {
           if(c == 'a'){
               if(charArray[i] != c){
                   return !s.substring(i).contains("a");
               }
           }else{
               if(charArray[i] != c){
                   return !s.substring(i).contains("b");
               }
           }
        }
        return false;
    }
}
