package com.modernjava.prepare.one;

public class IfElse_9 {

    public static void main(String[] args) {
        /*
            1 循序
            2 條件判斷 <--
            3 迴圈
         */

        boolean condition = true;

        if (condition) {
            // block of code to be executed if the condition is true
        }

        if (15 > 18) {
            System.out.println("20 is greater than 18");
        }


        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        boolean condition1 = 3<2;

        if(condition1){
            // true
            System.out.println('a');
        } else {
            // false
            System.out.println('b');
        }


        System.out.println();

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

        // if        假設 case1
        // else if   假設 case2
        // else      其他

        if (time2 < 10) {
            System.out.println("Good morning.");
        } else if (time2 < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        System.out.println();




        int time3 = 20;
        if (time3 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }







        /*
        Conditional (ternary) Operator
        中文翻譯為，「三元運算子」。

        if(time4 < 18){
            "Good day."
        } else {
            "Good evening."
        }


         */


        int time4 = 20;
        String result = (time4 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

/*
        if(){

        }

        if(){

        }else {

        }

        boolean xxx = () ? case1 : case2;
        System.out.println();


        if(){

        }else if() {

        }else{

        }
*/
        // 如果 我的英文夠好，我要進外商工作
        boolean myEnglishGoodEnough = false;

        if(myEnglishGoodEnough){
            System.out.println("我要進外商工作");
        } else {
            System.out.println("我進不了外商工作");
        }

        System.out.println();

        if(true)
            System.out.println();
         else
            System.out.println();



        // 如果 我的英文夠好，我要進外商工作
        // 如果 我一天喝三杯咖啡，我晚上會睡不著覺


        // 如果 我有三百萬以上，我要環境世界
        // 如果 我有二百萬以上，我要買一台車
        // 用這個說明 if else if else 跟 if if 的差別

        int myMoney = 3000001;

        if(myMoney > 3000000){ // case 1
            System.out.println("我要環境世界1");
        } else if(myMoney > 2000000){ // case 2
            System.out.println("我要買一台車1");
        } else if(myMoney > 2000000){ // case 3
            System.out.println("我要買一台車1");
        } else if(myMoney > 2000000){ // case 4
            System.out.println("我要買一台車1");
        } else if(myMoney > 2000000){ // case 6
            System.out.println("我要買一台車1");
        }


        // case 1
        if(myMoney > 3000000){
            System.out.println("我要環境世界2");
        }
        // case 2
        if(myMoney > 2000000){
            System.out.println("我要買一台車2");
        }








        // 如果 我考過N1 加薪5千
        // 如果 我考過N2 加薪3千
        // 如果 都沒有   準備吃土



    }



}
