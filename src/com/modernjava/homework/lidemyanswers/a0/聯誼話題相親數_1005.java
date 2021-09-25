package com.modernjava.homework.lidemyanswers.a0;

/*
15可被5整除，5就是因數
例如說 220 的全部正因數（扣掉自己）相加是：1+2+4+5+10+11+20+22+44+55+110 = 284
而 284 的全部正因數（扣掉自己）相加總和是：1+2+4+71+142 = 220
 */

public class 聯誼話題相親數_1005 {

    // 其實就是判斷一個數字是不是相親數
    public static void main(String[] args) {
        int[] intArr = {220,221,222,223};

        // 找出一個數字的全部因數(不含自身)，並加總，得到一個數字a
        // 把數字a，做上一動，得到一個數字b
        // 若a==b就是相親數，不等就不是，收工。
        for(int a : intArr){
            int result = getAmicableNumber(a);
            if(result==-1)
                System.out.println("QQ");
            else
                System.out.println(result);
        }

    }

    public static int getAmicableNumber(int num){

        int sum1 = 0;
        for(int i = 1; i<num; i++){
            if(num%i == 0)
                sum1+=i;
        }

        int sum2 = 0;
        for(int i = 1; i<sum1; i++){
            if(sum1%i == 0)
                sum2+=i;
        }

        if(num==sum2)
            return sum1;
        else
            return -1;

    }


}
