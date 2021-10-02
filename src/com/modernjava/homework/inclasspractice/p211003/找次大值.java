package com.modernjava.homework.inclasspractice.p211003;

public class 找次大值 {
    // 找次大值
    /*
        左側放兩張牌，最大的 與 次大的
        現在翻開一張牌
        case 1 牌 > 最大 ->

        case 2 最大 > 牌 > 次大

        case 3 次大 > 牌
     */
    public static void main(String[] args) {
//        int[] i = {4, 8, 1, 5, 3};
        int[] i = {-4, 2, 1, -5, 3};
        int secondLargest = findSecondLargest(i);
        System.out.println(secondLargest);
    }


    public static int findSecondLargest(int[] intArr) {
        // 因為是存最大與次大值，所以一開始初值先給一個很小的整數，這裡給-1
        int largest = -1;
        int secondLargest = -1;

        for(int i = 0; i< intArr.length; i++){
            if(intArr[i] > largest){
                secondLargest = largest;
                largest = intArr[i];
            } else if (intArr[i] < largest && intArr[i] > secondLargest){
                secondLargest = intArr[i];
            } else {

            }
        }

        return secondLargest;
    }

}