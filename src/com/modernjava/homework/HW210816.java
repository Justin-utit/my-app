package com.modernjava.homework;

public class HW210816 {
    public static void main(String[] args) {
        int number = 0;

        // ---------------------- 起
        if (number == 0) {
            System.out.println("區塊A");
        } else if (number > 0 && number <= 50) { // 1-50
            System.out.println("區塊B");
        } else if (number > 50 && number <= 100) { // 51-100
            System.out.println("區塊C");
        } else {
            System.out.println("區塊D");
        }

        if (number == 0) {
            System.out.println("區塊E");
        }
        if (number > 0 && number <= 50) { // 1-50
            System.out.println("區塊F");
        }
        if (number > 50 && number <= 100) { // 51-100
            System.out.println("區塊G");
        }
        if (number < 0 || number > 100) {
            System.out.println("區塊H");
        }
        if (number > 50) {
            System.out.println("區塊I");
        }
        if (number < 150) {
            System.out.println("區塊J");
        }
        // ---------------------- 迄

        /*
            問題1: 如果 number = 0; (如上例)，執行起迄內程式區塊，會印出什麼?
            問題2: 如果 number = 200; ，執行起迄內程式區塊，會印出什麼?
            問題2: 如果 number = 100; ，執行起迄內程式區塊，會印出什麼?
         */

        /*
            答案:
            Q1: AEJ
            Q2: DHI
            Q3: CGIJ
         */
    }
}
