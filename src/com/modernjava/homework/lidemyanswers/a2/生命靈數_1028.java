package com.modernjava.homework.lidemyanswers.a2;

public class 生命靈數_1028 {
    public static void main(String[] args) {
        String birthday = "1991 11 7";
//        String birthday = "1946 06 14";
        int lifeNum = getLifeNum(birthday);
        System.out.println(lifeNum);
    }

    public static int getLifeNum(String birthday){
        birthday = birthday.replace(" ", "");

        char[] chars = birthday.toCharArray();
        int sum = 0;
        for (char c : chars)
            sum += Integer.valueOf(String.valueOf(c));
        // 9*8 = 72 -> 最大就兩位數
        String sumStr = String.valueOf(sum);
        int lifeNum = Integer.valueOf(sumStr.substring(0,1)) + Integer.valueOf(sumStr.substring(1));

        return lifeNum;
    }
}
