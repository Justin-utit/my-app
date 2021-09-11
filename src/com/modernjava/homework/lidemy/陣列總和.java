package com.modernjava.homework.lidemy;

public class 陣列總和 {
    /*
    給一個陣列 arr，裡面全都包含了數字（整數），請輸出陣列加總的結果（總和保證不超過 int 範圍）
    範例輸入：[1, 2, 3]
    範例輸出：6
     */
    public static void main(String[] args) {
        int[] intArray = {1,2,3};
        int sum = sumArray(intArray);
        System.out.println(sum);
    }

    public static int sumArray(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}
