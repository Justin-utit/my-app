package com.modernjava.prepare.one;

public class Strings_6 {
    public static void main(String[] args) {
        String greeting = "Hello";
        // int double
        String txt = "    ABCDEFGHIJKLMNOPQRSTUVWXYZ    ";
        System.out.println("The length of the txt string is: " + txt.length());


        // how to read javadoc

        // 官方文件
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

        // 簡單說明結構(中文版)
        // https://www.matools.com/api/java8

        // 示範
        // 從文件中，找到 trim() 的使用說明
        // 看說明並實際使用



        // 練習
        // 從文件中，找到 toLowerCase() 的使用說明
        // 看說明並實際使用


        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"


        // 找字串中的某字
        String txt3 = "Please locate where 'locate' occurs!";
        // 前
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        // 中
        System.out.println(txt3.indexOf("locate",13)); // Outputs 7

        // 後
        System.out.println(txt3.lastIndexOf("locate"));


        // 串接
        String firstName = "John";
        String lastName = "Doe";
        // 方法1
        System.out.println(firstName + " " + lastName);
        // 方法2 (較少用)
        System.out.println(firstName.concat(lastName));



        // "  \  n  t

        // 跳脫字元
        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);

        // it\'s  john's

        String txt5 = "It's alright.";
        System.out.println(txt5);

        String txt6 = "The character \\ is called backslash.";
        System.out.println(txt6);


        String txt7 = "Because strings must be written within quotes, \nJava will misunderstand this string, and generate an error:";
         System.out.println(txt7);

        // 實務上幾乎沒有看過\r, 如果你很閒or很有研究精神，有人已經針對\n \r的差別進行了研究，請自行參考。
        // http://puremonkey2010.blogspot.com/2011/10/java-java-n-or-rn.html
        // https://www.itread01.com/content/1547139255.html

        // tab
        String txt9 = "Hello\tWorld!";
        System.out.println(txt9);

        // Backspace
        String txt8 = "Hel\blo World!";
        System.out.println(txt8);

        // 結論:
        // 會 \n \t \" \' \\ 這5個常用的就可以了


        int x = 10;
        int y = 20;
        int z = x + y;

        String x1 = "10";
        String y1 = "20";
        String z1 = x1 + y1;

        // If you add a number and a string, the result will be a string concatenation:
        String x3 = "10";
        int y3 = 20;
        String z3 = x3 + y3;


    }
}
