package com.modernjava.homework.inclasspractice;
/*
    有幾種常見的轉型
    字串轉數字 & 數字轉字串 -> 最常見的
    之後還有日期
    字元 、字串、數字、日期  -> 這四種資料型態，常見互相轉來轉去

    因為還沒講到日期型態，以下先整理 String int char 間的互轉
        -> String int & int String
        -> String char & char String
        -> int char & char int
    https://www.javatpoint.com/java-string-to-int
    這個網址的左側選單，有全部的Java Conversion
 */
public class 常用的型態轉換 {

    public static void main(String[] args) {
        // 1 String & int 互轉
        stringIntConvert();
        // 2 String & char 互轉
        stringCharConvert();
        // 3 int & char 互轉
        intCharConvert();
    }

    public static void stringIntConvert(){
        // 字串轉int
        String str = "1";
        int num = Integer.valueOf(str);
        System.out.println(num); // 1

        // int轉字串
        int num1 = 1;
        String str1 = String.valueOf(num1);
        System.out.println(str1); // 1
    }

    public static void stringCharConvert(){
        // char to String
        char num8 = '1';
        String num9 = String.valueOf(num8);
        System.out.println(num9);

        // String to char
        String num10 = "1";
        char num11 = num10.charAt(0);
        System.out.println(num11);
    }

    public static void intCharConvert(){
        // char to int
        char num2 = '1';
//        int num3 = num2;
//        System.out.println(num3); // 會印出49，故不能這樣處理
        // 方法1: 先轉為字串，再從字串轉數字 (轉兩次比較麻煩)
        int num4 = Integer.parseInt(String.valueOf(num2));
        System.out.println(num4); // 1
        // 方法2: 用內建函式直接轉 (比較直接)
        int num5 = Character.getNumericValue(num2);
        System.out.println(num5); // 1

        // int to char
        int num6 = 1;
//        char num7 = (char) num6;
//        System.out.println(num7); // 會印出亂碼，故不能這樣處理
        char num7 = Character.forDigit(num6,10); // 十進位
        System.out.println(num7);
    }


}
