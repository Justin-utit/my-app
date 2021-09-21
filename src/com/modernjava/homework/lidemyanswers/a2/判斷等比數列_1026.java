package com.modernjava.homework.lidemyanswers.a2;


public class 判斷等比數列_1026 {

    public static void main(String[] args) {
//        int num = 3;
//        String setOfNumbers = "3 9 27";

        int num = 4;
        String setOfNumbers = "2 8 32 128";

        boolean isGeometricSequence = isGeometricSequence(num, setOfNumbers);
        System.out.println("是否為等比數列: "+isGeometricSequence);
    }

    /*
    In:
        輸入的第一行為一個數字 N，代表數列裡總共有幾個數字
        接下來第二行為數列中的數字，彼此用空格分隔
    Out:
        若是輸入的數列為等比數列，請輸出 Yes，反之輸出 No

        3
        3 9 27

        true
     */
    public static boolean isGeometricSequence(int n, String numbers){

        String[] strArr = numbers.split(" ");
        int first = Integer.valueOf(strArr[0]);
        int second = Integer.valueOf(strArr[1]);

        int baseNum = second/first;

        for(int i=0; i<strArr.length-1; i++){ // 0 1
            int eachNum = Integer.valueOf(strArr[i+1]) / Integer.valueOf(strArr[i]);
            if(baseNum!=eachNum)
                return false;
        }

        return true;
    }

}

/*
    Description

    大家還記得國中的時候學過的等比數列嗎？

    在等比數列裡面，相鄰兩項的比例相同，舉例來說：

    3, 6, 12, 24, 483,6,12,24,48 就是等比數列，
    因為 6/3、12/6、24/12、48/24 的值都相等，而且都是 2，我們就稱這個等差數列的公比為 2

    現在給你一個數列，請判斷是否為等比數列。




 */























