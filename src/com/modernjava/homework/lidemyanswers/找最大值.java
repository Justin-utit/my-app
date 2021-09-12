package com.modernjava.homework.lidemyanswers;

public class 找最大值 {
    /*
    給一個陣列 arr，裡面全都包含了數字（整數），請輸出陣列中的最大值
    範例輸入：[1, 2, 3]
    範例輸出：3
     */
    public static void main(String[] args) {
        int[] i = {1,2,3};
        int max = findMax(i);
        System.out.println(max);
    }

    public static int findMax(int[] intArr){
        int max = intArr[0];
        for(int i : intArr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
