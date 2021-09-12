package com.modernjava.homework.lidemyanswers;

public class Unit16 {
    /*
        找最小值
        假設今天你有一副撲克牌
        一次只能看一張牌
        你會怎麼找到最小的牌

     */
    public static void main(String[] args) {

        int[] nums = {8,9,7,100,2,18,33};
        int min = findMin(nums);
        System.out.println("最小值為: " + min);

    }


    public static int findMin(int[] nums){
        // 打開第一張牌，先當成最小
        int min = nums[0]; // 2

        for (int num : nums){
            if(num < min) // ? < 2
                min = num;
        }

        return min;
    }

}
