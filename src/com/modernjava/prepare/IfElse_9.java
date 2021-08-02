package com.modernjava.prepare;

public class IfElse_9 {

    public static void main(String[] args) {

        boolean condition = true;

        if (condition) {
            // block of code to be executed if the condition is true
        }

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        if (condition) {
            // block of code to be executed if the condition is true
        } else {
            // block of code to be executed if the condition is false
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

/*
        if (condition1) {
            // block of code to be executed if condition1 is true
        } else if (condition2) {
            // block of code to be executed if the condition1 is false and condition2 is true
        } else {
            // block of code to be executed if the condition1 is false and condition2 is false
        }
*/
        int time2 = 22;
        if (time2 < 10) {
            System.out.println("Good morning.");
        } else if (time2 < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }


        int time3 = 20;
        if (time3 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int time4 = 20;
        String result = (time4 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


        // 如果 我的英文夠好，我要進外商工作
        // 如果 我一天喝三杯咖啡，我晚上會睡不著覺


        // 如果 我有三百萬以上，我要環境世界
        // 如果 我有二百萬以上，我要買一台車
        // 用這個說明 if else if else 跟 if if 的差別


        // 如果 我考過N1 加薪5千
        // 如果 我考過N2 加薪3千
        // 如果 都沒有   準備吃土



    }



}
