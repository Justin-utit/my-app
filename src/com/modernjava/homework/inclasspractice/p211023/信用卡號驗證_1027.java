package com.modernjava.homework.inclasspractice.p211023;

// https://oj.lidemy.com/problem/1027

public class 信用卡號驗證_1027 {

    public static void main(String[] args) {
//        String creditCard = "5412-3456-7890-1232";

        String creditCard = "4733-3535-0704-5234"; // this is visa

        String result = isCreditCardValid(creditCard);
        System.out.println("是否為合法的信用卡? "+result);
    }

    /*
    Input
        輸入為一個信用卡卡號，皆為 16 碼，每 4 碼以 - 做為分隔
    Output
        若是信用卡不合法，請輸出 INVALID
        否之則輸出信用卡的發卡行，只會有 VISA 與MASTER_CARD 這兩種結果
     */
    public static String isCreditCardValid(String cardNum){ // 5412-3456-7890-1232


        return null;
    }
}
