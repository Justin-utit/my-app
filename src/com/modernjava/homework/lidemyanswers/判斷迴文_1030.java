package com.modernjava.homework.lidemyanswers;

public class 判斷迴文_1030 {
    public static void main(String[] args) {
//        String str = "abbbba";
        String str = "ac";

        boolean isReversedStr = isPalindrome(str);
        System.out.println("是否為迴文? " + isReversedStr);

    }

    public static boolean isPalindrome(String str){
        return str.equals(reverseStr(str));
    }

    public static String reverseStr(String str){

        char[] chars = str.toCharArray();
        String reversedStr = "";
        for(int i = chars.length - 1; i>=0; i--){
            reversedStr += chars[i];
        }

        return reversedStr;
    }
}
















