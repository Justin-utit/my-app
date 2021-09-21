package com.modernjava.homework.lidemyanswers;
    /*
        33 -> 9 19 29 -> 33 - 3 = 30

        100 -> 9 19 29 ... 99


        1 2 3 4 5 6 7 8 9  10
        1 2 3 4 5 6 7 8 10 11


        11 12 13 14 15 16 17 18 19 20
        12 13 14 15 16 17 18 20 21 22


        21 22 23 24 25 26 27 28 29 30
        23 24 25 26 27 28 30 31 32 33

    // 齊數   第幾個數字
        10 -> 9     (9*1)
        20 -> 18    (9*2)
        30 -> 27    (9*3)
        40 -> 36    (9*4)

        45 -> 41
        48 -> 44

        50 -> 45
        60 -> 54
        70 -> 63
        80 -> 72
        90 -> 81

        90 -> 9*9 = 81

        95 -> 86

        100 -> 9*10 = 90

     */
public class 不九人世_1014 {
    public static void main(String[] args) {

        int num = 33;
        int kiNum = getSequenceNumber(num);
        System.out.println(kiNum);

    }

    public static int getSequenceNumber(int num){ // 95

        int multipler = num / 10; // 9

        int baseNum = 9*multipler; // 81

        int remainder = num%10; // 5

        return baseNum+remainder;
    }

}












