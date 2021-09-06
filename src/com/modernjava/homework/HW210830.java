package com.modernjava.homework;
public class HW210830 {
    public static void main(String[] args) {

        // 1. x是多少?
        System.out.println("\n第一題: ");
        int[][] myNumbers = { {9, 8, 7}, {3, 2, 3, 4} };
        int x = myNumbers[0][2];
        System.out.println(x);

        // 2. #2會印出多少
        System.out.println("\n第二題: ");
        for (int i = 0; i < myNumbers.length; i++) {

            for(int j = 0; j < myNumbers[i].length; j++) {
                System.out.printf("%d ", myNumbers[i][j]); // #2
            }

            if(i==1)
                break;
        }

        // 3. 簡單說明什麼是 method Overload (多載)?
        // 方法的參數型態不同或參數的數量不同即可形成overload, 但若只有回傳型態不同，則不行


        // 4 5 6 都是遞迴題

        // 4. result為多少?
        System.out.println("\n\n第四題: ");
        int result = factorial(4);
        System.out.println(result);

        // 5. result2為多少?
        System.out.println("\n第五題: ");
        int result2 = sum(5, 10);
        System.out.println(result2);

        // 6. 挑戰題! 這會印出多少?
        System.out.println("\n第六題: ");
        printFun(3);

        /* 7. 英文a-j 分別算是類別/物件/屬性/方法?
        a. 馬力、排氣量(engine displacement) -> 屬性 attributes
        b. 發動引擎 -> 方法 methods
        c. 售價 -> 屬性 attributes
        d. 剎車 -> 方法 methods
        e. CAMRY設計藍圖 -> 類別 class
        f. 小明買的CAMRY -> 物件 objects
        g. 老王租的CAMRY -> 物件 objects
        h. 安全氣囊 -> 方法 methods, 物件 objects
        i. 自動駕駛 -> 方法 methods
        j. 引擎 -> 物件 objects
         */

        System.out.println("--------------------------------");
    }

    static int factorial(int n) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;

    }
    /*
        int result = factorial(4);
        4 * f(3)
        4 * 3 * 2 * 1 * 1 = 24
     */

    public static int sum(int start, int end) {
        if (start < end)
            return end + sum(start+1, end);
         else
            return 0;
    }
    /*
        int result2 = sum(5, 10);
        10 + sum(6,10)
        10 + 10 + 10 + 10 + 10 + 0

     */

//    void myMethod1(){
//
//
//        return;
//    }

    static void printFun(int test) { // 3
        if (test < 1) // test = 0
            return;
         else {
            System.out.printf("%d ", test); //

            printFun(test - 1); // test=3

            System.out.printf("%d ", test);
            return;
        }
    }

    /*
        printFun(3);

        p(3) -> 3, p(2), 3
                   p(2) -> 2, p(1), 2
                              p(1) -> 1, p(0), 1

        這一題考三個概念:
            遞迴、方法呼叫流程、return & void
     */


}













    /*
    3
    p(3) -> 3, p(2)
    p(2) ->    2, p(1)
    p(1) ->       1, p(0)
    p(0) -> return nothing, program moves on, print 1, return nothing again, print 2 return nothing again, print 3

    p(3) -> p(2) -> p(1) -> p(0)


    p(3){
    3
        p(2){
        2
            p(1){
            1
                p(0) -> do nothing
            1
            }
        2
        }
    3
    }
     */






