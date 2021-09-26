package com.modernjava.homework.lidemyanswers;

public class 陣列總和 {
    /*
    給一個陣列 arr，裡面全都包含了數字（整數），請輸出陣列加總的結果（總和保證不超過 int 範圍）
    範例輸入：[1, 2, 3]
    範例輸出：6
     */
    public static void main(String[] args) {
        int[] intArray1 = {1,2,3}; // mac id = 物件的身份證 = xx123
//        int sum = sumArray(intArray);
//        System.out.println(sum);
        int[] intArray2 = {1,2,3};
        int[] intArray3 = {1,2,3};

        int[] xx = test(intArray1);
        System.out.println();
    }

    public static int[] test(int[] intArr){

        intArr[0] = 9;

        return intArr;
    }

    public static int sumArray(int[] intArr){

        intArr[0] = 9;

        int sum = 0;
        for(int i : intArr){
            sum += i;
        }
        return sum;
    }
}
