package com.modernjava.homework.lidemyanswers.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* 處理這樣的資料
    3
    5
    1
    2
    3
    3
    3
 */

public class ArrayIndexOf_1038 {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1038.txt");
            Scanner myReader = new Scanner(myObj);

            // 存input data (區域變數要手動給值)
            int firstNum = 0;
            int secondHowManyNums = 0;
            int[] intArr = new int[0];

            // get input data
            int counter = 0;
            int tempIndex = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);

                if(counter==0)
                    firstNum = Integer.valueOf(data);

                if(counter==1) {
                    secondHowManyNums = Integer.valueOf(data);
                    intArr = new int[secondHowManyNums];
                }


                if(counter>1){
                    intArr[tempIndex] = Integer.valueOf(data);
                    tempIndex++;
                }

                counter++;
            }

            System.out.println(firstNum);           // 3
            System.out.println(secondHowManyNums);      // 5

            // ------------------------------------------------ 以上拿到該拿的東西
            for(int i : intArr){

                System.out.println(i);
            }


            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
