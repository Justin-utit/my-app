package com.modernjava.homework.lidemyanswers;

// https://oj.lidemy.com/problem/1023
/*
    Description

    請你按照題目給予的數字 N，輸出 N 層的聖誕樹，範例如下：

    N=1

        *
    N=2

         *
        ***
         |
    N=3

          *
         ***
        *****
          |
          |
    N=4

           *
          ***
         *****
        *******
           |
           |
           |

        Input
        一個正整數 N，1 &lt;= N &lt;= 301<=N<=30

        Output
        請輸出 N 層聖誕樹的圖形
 */
public class 印出聖誕樹_1023 {

    public static void main(String[] args) {
        int level = 4;
        printPyramid(level);
    }

    public static void printPyramid(int n){
        // 所需*數
        int lastLineStarNum = (n*2) - 1;

        for(int i = 1; i<=n; i++){ // i = 1 - 4
            // i = 1...4
            int startNum = (i*2) -1; // 1...7
            int blankNum = (lastLineStarNum-startNum) / 2; // 3...0

            for(int j = 1; j<=blankNum; j++)
                System.out.print(" ");

            for(int k = 1; k<=startNum; k++){
                if(blankNum==0 && k==startNum) // 印末行*，須換行
                    System.out.println("*");
                else
                    System.out.print("*");
            }

            for(int j = 1; j<=blankNum; j++){
                if(j==blankNum)
                    System.out.println(" ");
                else
                    System.out.print(" ");
            }
        }

        // 所需 | 數
        int pipeNum = n-1; // 3
        // 位置
        int numOfLeftBlank = (lastLineStarNum-1) / 2; // 3
        for(int i = 1; i<=pipeNum; i++){
            for (int j = 1; j<=numOfLeftBlank; j++)
                System.out.print(" ");
            if(i==pipeNum)
                System.out.print("|");
            else
                System.out.println("|");
        }

    }

}

















