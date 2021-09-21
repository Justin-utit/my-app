package com.modernjava.homework.lidemyanswers.a4c;

public class StringSlice_1045 {
    public static void main(String[] args) {
        // abcdef
        String str = "abcde";
        int start = 0;
        int end = 3;
        String slicedStr = slice(str, start, end);
        System.out.println("slicedStr: " + slicedStr);
    }

    public static String slice(String str, int start, int end){
        return str.substring(start,end);
    }
}
