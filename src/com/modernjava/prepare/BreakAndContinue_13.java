package com.modernjava.prepare;

public class BreakAndContinue_13 {
    public static void main(String[] args) {

        // 0 - 9: 0-3
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println();

        // continue -> 跳過當前迴圈
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }



        int i = 0;
        while (i < 10) { // 0 - 9
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        int i2 = 0;
        while (i2 < 10) { // 0 - 9
            if (i2 == 4) {
                i2++;
                continue;
            }
            System.out.println(i2);
            i2++;
        }


    }
}
