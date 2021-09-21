package com.modernjava.homework.lidemyanswers;

public class TwoSum_1050 {
    public static void main(String[] args) {
        String str1 = "5 3";
        String str2 = "1 7 9 8 2";
        twoSum(str1,str2);
    }

    public static void twoSum(String str1, String str2){

        int howManyNums = Integer.valueOf(str1.split(" ")[0]); // 共有幾個數字
        int target = Integer.valueOf(str1.split(" ")[1]); // 目標

        int[] intArr = new int[howManyNums];
        String[] strings = str2.split(" ");
        for(int i = 0; i<strings.length; i++)
            intArr[i] = Integer.valueOf(strings[i]);

        /*
            5 3
            1 7 9 8 2
         */
        for(int i = 0; i<intArr.length; i++){
            for(int j = i+1; j<intArr.length; j++){
                if(target == (intArr[i]+intArr[j]))
                    System.out.println(i+" "+j);
            }
        }


    }
}
