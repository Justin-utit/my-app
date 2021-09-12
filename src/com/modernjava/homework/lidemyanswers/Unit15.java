package com.modernjava.homework.lidemyanswers;

public class Unit15 {
    /*
        給一個數字n
        印出1-n
        如果碰到3的倍數 (數字%3 == 0)，改印Fizz
        碰到5的倍數，改印Buzz
        若同時是3跟5的倍數，印FizzBuzz
        example n=7
        1 2 Fizz 4 Buzz Fizz 7

     */
    public static void main(String[] args) {
//        fizzBuzz(7);

//        fizzBuzz(7); // 20, 50
    }

    public static void fizzBuzz(int num){ //
//        int n = 18;
        // 1 - 18
        for(int i = 1; i<=num; i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
             else if(i%3 == 0)
                System.out.println("Fizz");
             else if(i%5 == 0)
                System.out.println("Buzz");
             else
                System.out.println(i);
        }


    }

}
