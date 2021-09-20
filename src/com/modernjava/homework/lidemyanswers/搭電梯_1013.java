package com.modernjava.homework.lidemyanswers;

public class 搭電梯_1013 {
    /*
        不跳
        跳1
        跳2
        跳3
        跳4
        跳5…
     */
    public static void main(String[] args) {
        int num = 8; // 2 - 20 範圍
        int ways = findWaysToGoTo(num);
        System.out.println("ways: "+ways);

    }

    public static int findWaysToGoTo(int num){
        if(num==2)
            return 1;


        int i = 1;
        int sum = 1; // 不跳 1
        do{
            num -= 2*i;
            System.out.println(num);
            /*
            7 - 2 = 5
            5 - 2 = 3
            3 - 2 = 1
             */
            sum+=num;
        }while(num>1);


        return sum;
    }



}
