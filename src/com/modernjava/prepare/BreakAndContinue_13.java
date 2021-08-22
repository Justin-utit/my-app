package com.modernjava.prepare;

public class BreakAndContinue_13 {
    public static void main(String[] args) {

        // break; 中止
        // continue;

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // 「中止」迴圈
            }
            System.out.println(i);
        }
        // break
        // 印 3 - 11
        // 到 7 就中止

        // continue
        // 印 3 - 11
        // 跳過 7

        System.out.println("--------------1-------------");

        // continue ->
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // 「跳過」this 當前迴圈
            }
            System.out.println(i);
        }




        System.out.println("--------------2-------------");

        int i = 0;
        while (i < 10) { // 0 - 9
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        System.out.println("--------------3-------------");

        int j = 0;
        while (j < 10) { // 0 - 9
            if (j == 4) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }


    }
}
