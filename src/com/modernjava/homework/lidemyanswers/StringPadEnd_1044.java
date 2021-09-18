package com.modernjava.homework.lidemyanswers;
/*
    double d = 1.999;
    System.out.println(Math.round(d)); // 2 為四捨五入，
    System.out.println(Math.ceil(d));  // 2.0 為無條件進位
    System.out.println(Math.floor(d)); // 1.0 為無條件捨去。
 */
public class StringPadEnd_1044 {
    public static void main(String[] args) {
        // abc 1 zzz -> 不動
        // abcaa 5 xyz -> 不動
        // abc 5 abcdefghijk -> abcab 超過的要截段
        // abc 5 a -> abcaa 不足的要重複
        // abcaa 10 xyz -> abcaaxyzxy

        // 5組測試ok
        String str = "abc";
        int length = 1;
        String stuffing = "zzz";
        String strInFull = padEnd(str, length, stuffing);
        System.out.println("填充後字串: " + strInFull);
    }

    public static String padEnd(String str, int length, String stuffing){
        // abc 1 zzz -> 不動
        // abcaa 5 xyz -> 不動
        int strLength = str.length();
        if(length<=strLength)
            return str;

        // abc 5 abcdefghijk -> abcab 超過的要截段
        String combinedStr = str+stuffing;
        if(combinedStr.length()>length)
            return combinedStr.substring(0,length);

        // abc 5 a -> abcaa 不足的要重複
        // abcaa 10 xyz -> abcaaxyzxy

        int exeTimes = 0;
        int shorts = (length - strLength);
        int stuffingLength = stuffing.length();
        if(shorts % stuffingLength == 0)
            exeTimes = shorts / stuffingLength;
        else
            exeTimes = (shorts / stuffingLength) + 1;

        for (int i = 0; i<exeTimes; i++)
            str += stuffing;

        if(str.length()>length)
            return str.substring(0,length);
        else
            return str;

    }
}
