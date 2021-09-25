package com.modernjava.homework.lidemyanswers.a0;
/*
    接著每一行會有三個用空白分隔的數字 A, B, K
    K 只會有兩種情況：1 或是 -1，若是 1 代表數字大的獲勝，K 若是 -1 代表數字小的獲勝
 */
public class 聯誼順序比大小_1004 {

    public static void main(String[] args) {

        int[][] int2DArr = {{1,2,1},{1,2,-1},{2,2,1}};

        for(int i = 0; i<int2DArr.length; i++){

            int num1 = int2DArr[i][0];
            int num2 = int2DArr[i][1];
            int num3 = int2DArr[i][2];

            if(num3==1){ // 數字大的勝
                if(num1>num2){
                    System.out.println("A");
                } else if(num1<num2){
                    System.out.println("B");
                } else {
                    System.out.println("DRAW");
                }
            } else if (num3==-1){ // 數字小的勝
                if(num1>num2){
                    System.out.println("B");
                } else if(num1<num2){
                    System.out.println("A");
                } else {
                    System.out.println("DRAW");
                }
            }


        }



    }

}
