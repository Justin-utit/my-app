package com.modernjava.homework.lidemyanswers.a4c;

public class StringEndsWith_1043 {
    public static void main(String[] args) {
        String str = "abcde";
        String target = "f";
//        String target = "cde";
        boolean result = endsWith(str, target);
        System.out.println(str + " ends with " + target + ": " + result);
    }

    public static boolean endsWith(String str, String target){
        // abcde
        int targetLength = target.length(); // 3
        int index = str.length() - targetLength;
        return str.substring(index).equals(target);

    }
}
