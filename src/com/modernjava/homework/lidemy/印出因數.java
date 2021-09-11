package com.modernjava.homework.lidemy;
/*
    15的因數 -> 餘數為零的那些數字
    1,3,5,15
    30的因數 -> 餘數為零的那些數字

 */
public class 印出因數 {

    public static void main(String[] args) {
        int num = 15;
        num = 30;
        printFactors(num);
    }

    public static void printFactors(int num){
        for (int i = 1; i<=15; i++){
            if(num % i == 0)
                System.out.printf("%d ",i);
        }
    }

}
