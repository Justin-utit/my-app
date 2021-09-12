package com.modernjava.homework.lidemy;

public class Unit14 {


    // 印出1-100的奇數
    /*
        數字 % 2 != 0 -> 奇數

     */
    public static void main(String[] args) {

        for(int i = 1; i<101; i++){
            if(i%2 != 0)
                System.out.printf("%d ",i);
//                System.out.println(i);
        }

//        System.out.println(4%2);

    }

}
