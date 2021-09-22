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
                System.out.println(data);

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




            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
