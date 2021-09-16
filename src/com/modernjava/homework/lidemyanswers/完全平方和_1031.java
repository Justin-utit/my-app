package com.modernjava.homework.lidemyanswers;

public class 完全平方和_1031 {
    public static void main(String[] args) {
        int n = 30;
        int sum = sumOfPerfectSquare(n);
        System.out.println("完全平方數的總和: "+sum);
    }

    public static int sumOfPerfectSquare(int n){

        int sumOfPerfectSquare = 0;
        for(int i = 1; i<=n; i++){
            int square = i*i;
            if(square <= 30)
                sumOfPerfectSquare += square;
            else
                break;
        }

        return sumOfPerfectSquare;
    }

}
