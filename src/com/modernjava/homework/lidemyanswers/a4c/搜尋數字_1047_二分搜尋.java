package com.modernjava.homework.lidemyanswers.a4c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 搜尋數字_1047_二分搜尋 {
    public static void main(String[] args) {

        // 從檔案把資料讀進來
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1047_二分搜尋.txt");
            Scanner myReader = new Scanner(myObj);

            int totalNums = 0;
            int target = 0;

            int[] intArr = new int[0];
            int pos = 0;

            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // System.out.println(data);

                if(counter==0){
                    totalNums = Integer.valueOf(data.split(" ")[0]);
                    target = Integer.valueOf(data.split(" ")[1]);
                    intArr = new int[totalNums];
                } else {
                    intArr[pos] = Integer.valueOf(data);
                    pos++;
                }

                counter++;
            }

            // https://oj.lidemy.com/problem/1047
            // ------------------- 使用二分搜尋法，找到target並回傳該index


            int targetIndex = binarySearch(intArr,target, totalNums);
            System.out.println("targetIndex: "+targetIndex);



            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static int binarySearch(int[] intArr, int target, int totalNums){
        int leftIndex = 0;
        int rightIndex = totalNums-1; // 9
        int midIndex = (leftIndex+rightIndex) / 2; // 4 - index

        // 假設今天要找的值為12
        // 0 1 2 3 4 5 6  7  8  9
        // 1 2 3 4 5 8 12 19 31 48

        // 5 6
        // 8 12

        while(leftIndex < rightIndex){ // 兩邊的指標會逐漸向彼此靠近
        // 0 9 -> mid 4 -> left = mid+1 = 5
            int leftNum = intArr[leftIndex];    // 左點值
            int rightNum = intArr[rightIndex];  // 右點值
            if(leftNum==target) // 值對到直回index
                return leftIndex;
            if(rightNum==target) // 值對到直回index
                return rightIndex;

            midIndex = (leftIndex+rightIndex) / 2;
            int midValue = intArr[midIndex]; // 19
            if(target>midValue)
                leftIndex = midIndex + 1; // 5
            else if (target<midValue)
                rightIndex = midIndex - 1;
            else // 找到了 target==midValue
                return midIndex;

            // 每一次找到的mid value, target必然大於，等於，小於之

            // 5 6  7  8  9
            // 8 12 19 31 48
            // 左0右9 -> mid 4 -> 5 < 19 -> 因為是大於，所以確定不為4，因此左點移至5

            // 左5右9 -> mid 7 -> 12 < 19 -> 右點移到 mid-1 = 6

            // 左5右9 -> mid 7 -> 19 < 31 -> 左點移到 mid+1 = 8

            // 左5右9 -> mid 7 -> 19 找到了

        }

        return -1;
    }
}
