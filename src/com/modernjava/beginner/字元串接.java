package com.modernjava.beginner;

public class 字元串接 {

    /* 前兩個方法目前還沒教到，可以先用第三個方法
       第三個方法其實算是字串的串接，因為當字串去串字元時 ""+'' ，會全部被當字串來處理，而字串是可以 "" + "" 的
     */

    public static void main(String[] args) {

        // 方法1
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        sb.append('b');
        sb.append('c');
        String str = sb.toString();

        // 方法2
        String str2 = new String(new char[]{'a', 'b', 'c'});

        // 方法3
        String str3 = "" + 'x' + 'y' + 'z';
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

    }
}
