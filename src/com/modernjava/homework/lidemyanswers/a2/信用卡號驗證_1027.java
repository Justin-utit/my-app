package com.modernjava.homework.lidemyanswers.a2;

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
        int lastDigit = Integer.valueOf(cardNum.substring(cardNum.length()-1));

        // Master Card 是 5 開頭，Visa 是 4
        String brand = "unknown brand";
        if(cardNum.substring(0,1).equals("5"))
            brand = "MASTER_CARD";
        else if (cardNum.substring(0,1).equals("4"))
            brand = "VISA";

        // 前 15 位數經過加權後加總, 會得出一個數字
        // 權重的部分你可以很簡單這樣記：左邊數起 奇數位是 2，偶數位是 1

        cardNum = cardNum.replace("-","");
        cardNum = cardNum.substring(0, cardNum.length() - 1); // 541234567890123

        int oddSum = 0;
        for(int i = 0; i<cardNum.length(); i+=2){
            // 奇數位 51357913
            int odd = Integer.valueOf(String.valueOf(cardNum.charAt(i)));
            // System.out.printf("%d ", odd);
            // 若是在計算的過程中某一位數加權後的結果比 10 大，那請減去 9
            int weightOdd = odd*2;  // 5*2 = 10,  1*2 = 2
            if(weightOdd>=10)
                oddSum += weightOdd-9;
            else
                oddSum += weightOdd;
        }

        int evenSum = 0;
        for(int i = 1; i<cardNum.length(); i+=2){
            // 偶數位 4246802
            int even = Integer.valueOf(String.valueOf(cardNum.charAt(i)));
            // System.out.printf("%d ", even);
            evenSum+=even*1;
        }

//        System.out.println(oddSum);
//        System.out.println(evenSum);


        int sum = oddSum + evenSum;
        int checkNum; // 檢查碼
        // 先把這數字除以 10 取餘數，如果結果是 0，那檢查碼就是 0，否則就是用 10 減去之後的結果
        if(sum % 10 == 0)
            checkNum = 0;
        else
            checkNum = 10 - (sum % 10);

        if(lastDigit==checkNum){ // 合法
            return brand;
        } else
            return "INVALID";
    }
}
