package com.modernjava.homework.lidemyanswers.a0;
/*
    double result2 =Math.pow(2, 5);//2的5次方 -> 32 (2*2*2*2*2)
    double result_pow=Math.pow( 100 , 0.5 ); //100的0.5次方 = 100開根號 -> 10
 */
public class 幾個水桶_1008 {
    public static void main(String[] args) {
        int num = 29; // 16 8 4 1 -> 4個
        int buckedneeded = findBucketNeeded(num);
        System.out.println("buckedneeded: "+buckedneeded);
        /*
            29 - 16(小於左數的最大水桶) = 13    1
            13 - 8 = 5                       2
            5 - 4 = 1                       3
            1                                4
         */

//         System.out.println("最大水桶的容量: " + largestBucketSize(29));
    }

    public static int findBucketNeeded(int num){

        int counter = 0;
        do{
            num = (int) (num - largestBucketSize(num));
            System.out.println("剩下要取的水: "+num);
            counter++;
        } while (num>0);

        // System.out.println("counter: "+counter);

        return counter;
    }

    public static double largestBucketSize(int num){
        for(int n = 0; n<32; n++){ // 2的0到31次方
            double result =Math.pow(2, n); // 2的n次方
            if(result > num){
                return Math.pow(2, n-1); // n-1 -> 最大水桶的次方數
            }
        }
        return -1;
    }
}













