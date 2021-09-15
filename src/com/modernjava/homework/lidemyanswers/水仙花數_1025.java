package com.modernjava.homework.lidemyanswers;

// https://oj.lidemy.com/problem/1025
/*
比較白話的定義為：「一個 n 位數的數字，每一個數字的 n 次方加總等於自身」

例如說 153 是三位數，而 1^3 + 5^3 + 3^3 = 1531 ，所以它就是一個水仙花數

而 1634 是四位數，而 1^4 + 6^4 + 3^4 + 4^4 = 1634，所以它也是一個水仙花數

而數字 0~9 也都是水仙花數，因為一位數 n 的 1 次方一定會等於自己

現在給你一個範圍 n 到 m，請你求出這範圍之中的水仙花數有哪些

Input
輸入為兩個用空白分割的正整數 N 與 M，1 &lt;= N &lt;= M &lt;= 10^61<=N<=M<=10
6

Output
請由小到大輸出從 N 到 M（包含 N 與 M）有哪些水仙花數，每個數字以空行分隔

Math.pow(double m, double n)
是求m的n次方的
ps:当然了，你也可以用循环实现^_^
 */
public class 水仙花數_1025 {

    // 寫一個方法，判斷某個數字是否為水仙花數
    public static void main(String[] args) {
//        int num = 153;
//        boolean isNarcissisticNumber = isNarcissisticNumber(153);
//        System.out.println("是否為水仙花數? " + isNarcissisticNumber);

        printNarcissisticNumbers(5,200);
    }

    public static void printNarcissisticNumbers(int n, int m){
        for(int i = n; i<=m; i++){
            if(isNarcissisticNumber(i))
                System.out.println(i);

        }
    }

    public static boolean isNarcissisticNumber(int num){
        boolean isNarcissisticNumber = false;

        String numStr = String.valueOf(num); // 153
        char[] charArr = numStr.toCharArray(); // 153
        int digits = numStr.length(); // 幾位數

        int sum = 0;
        for (char c : charArr){
            String cStr = String.valueOf(c);
            Integer oneDigit = Integer.valueOf(cStr); // 1

            int smallSum = 1;
            for(int i = 0; i<digits; i++)
                smallSum *= oneDigit;

//            System.out.println(smallSum);
            sum+=smallSum;
        }

        if (sum==num)
            isNarcissisticNumber=true;

        return isNarcissisticNumber;
    }

}















