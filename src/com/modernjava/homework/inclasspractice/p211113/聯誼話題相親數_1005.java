package com.modernjava.homework.inclasspractice.p211113;

/*
15可被5整除，5就是因數
例如說 220 的全部正因數（扣掉自己）相加是：1+2+4+5+10+11+20+22+44+55+110 = 284
而 284 的全部正因數（扣掉自己）相加總和是：1+2+4+71+142 = 220
 */

public class 聯誼話題相親數_1005 {

    // 其實就是判斷一個數字是不是相親數
    public static void main(String[] args) {
        int[] intArr = {220,221,222,223};

        for(int a : intArr){
            int result = getAmicableNumber(a);
            if(result==-1)
                System.out.println("QQ");
            else
                System.out.println(result);
        }

    }

    public static int getAmicableNumber(int num){ // 220



        return 0; // 不是相親數，就回傳-1
    }


}
