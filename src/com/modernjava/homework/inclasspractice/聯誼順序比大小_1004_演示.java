package com.modernjava.homework.inclasspractice;
/*
    接著每一行會有三個用空白分隔的數字 A, B, K
    K 只會有兩種情況：1 或是 -1，若是 1 代表數字大的獲勝，K 若是 -1 代表數字小的獲勝
 */
public class 聯誼順序比大小_1004_演示 {

    public static void main(String[] args) {
        // 1 2 1
        // 1 2 -1
        // 2 2 1

        // 記錄第一二三組的數字
//        int[] n1 = {1,2,1}; // int Array
//        int[] n2 = {1,2,-1};
//        int[] n3 = {2,2,1};
//        int[][] intArr = {n1, n2, n3}; // int Array 放到容器

        // 接著每一行會有三個用空白分隔的數字 A, B, K
        String str1 = "1 2 1";
        String str2 = "1 2 -1";
        String str3 = "2 2 1";
        String[] strArr = {str1, str2, str3};

        //
        for(String str : strArr){
            // 接著每一行會有三個用空白分隔的數字 A, B, K
            String[] strArray = str.split(" ");
//            System.out.println(strArray);

            // 字串轉數字 java
            int A = Integer.valueOf(strArray[0]);
            int B = Integer.valueOf(strArray[1]);
            int K = Integer.valueOf(strArray[2]);

            // K 只會有兩種情況：1 或是 -1，若是 1 代表數字大的獲勝，K 若是 -1 代表數字小的獲勝
            if(K==1){ // 大的勝

                // 若是 A 贏請輸出 A，B 贏請輸出 B，平手則輸出 DRAW
                if(A>B){
                    System.out.println("A");
                }else if(B>A){
                    System.out.println("B");
                } else {
                    System.out.println("DRAW");
                }

            } else if (K==-1){ // 小的勝

                // 若是 A 贏請輸出 A，B 贏請輸出 B，平手則輸出 DRAW
                if(A>B){
                    System.out.println("B");
                }else if(B>A){
                    System.out.println("A");
                } else {
                    System.out.println("DRAW");
                }

            }



        }



    }




}











