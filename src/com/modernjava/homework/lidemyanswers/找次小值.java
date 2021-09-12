package com.modernjava.homework.lidemyanswers;

public class 找次小值 {
    // 找次小值
    /*
        左側放兩張牌，最小的 與 次小的
        現在翻開一張牌
        case 1 牌 < 最小

        case 2 最小 < 牌 < 次小

        case 3 牌 > 次小
     */
    public static void main(String[] args) {
        int[] i = {4, 8, 1, 5, 3};
        int secondSmallest = findSecondSmallest(i);
        System.out.println(secondSmallest);
    }


    public static int findSecondSmallest(int[] intArr) {
        // 因為是存最小與次小值，所以一開始初值先給一個很大的整數，這裡給999
        int smallest = 999;
        int secondSmallest = 999;
        /*
                case 1 牌 < 最小
                case 2 最小 < 牌 < 次小
                case 3 牌 > 次小
         */
        for(int i = 0; i< intArr.length; i++){
            if(intArr[i] < smallest){
                secondSmallest = smallest;
                smallest = intArr[i];
            } else if (intArr[i]>smallest && intArr[i] < secondSmallest){
                secondSmallest = intArr[i];
            } else {

            }
        }

        return secondSmallest;
    }
}
