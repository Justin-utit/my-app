package com.modernjava.homework.lidemyanswers;

public class 倒著唸_1009 {
    public static void main(String[] args) {
        String str = "abcde";
        char[] chars = str.toCharArray();

        String strr = "";
        for(int i = chars.length-1; i>=0; i--){
            strr+=chars[i];
        }
        System.out.println(strr);
    }
}
