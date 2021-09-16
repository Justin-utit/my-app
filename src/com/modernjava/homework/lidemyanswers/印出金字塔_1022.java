package com.modernjava.homework.lidemyanswers;

// https://oj.lidemy.com/problem/1022
/*
    Description

    請你按照題目給予的數字 N，輸出 N 層的金字塔，範例如下：

    N=1

        *
    N=2

         *
        ***
    N=3

          *
         ***
        *****
    N=4

           *
          ***
         *****
        *******

        Input
        一個正整數 N，1 &lt;= N &lt;= 301<=N<=30

        Output
        請輸出 N 層金字塔的圖形
 */
public class 印出金字塔_1022 {

    public static void main(String[] args) {
        int level = 10;
        printPyramid(level);
    }

    public static void printPyramid(int n){
        // 所需*數
        int lastLineStarNum = (n*2) - 1;

        for(int i = 1; i<=n; i++){

            int startNum = (i*2) -1;
            int blankNum = (lastLineStarNum-startNum) / 2;

            for(int j = 1; j<=blankNum; j++)
                System.out.print(" ");

            for(int k = 1; k<=startNum; k++)
                System.out.print("*");

            for(int j = 1; j<=blankNum; j++){
                if(j==blankNum)
                    System.out.println(" ");
                else
                    System.out.print(" ");
            }
        }


    }

}

















