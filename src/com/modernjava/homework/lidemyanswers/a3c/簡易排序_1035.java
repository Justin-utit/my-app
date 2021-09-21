package com.modernjava.homework.lidemyanswers.a3c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class 簡易排序_1035 {

    public static void main(String[] args) {

        // 從檔案把資料讀進來
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1035.txt");
            Scanner myReader = new Scanner(myObj);


            int counter = 0;
            int[] intArr = new int[0];
            int numPos = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);

                if(counter==0){
                    int howManyNums = Integer.valueOf(data);
                    intArr = new int[howManyNums];
                } else {
                    int currentNum = Integer.valueOf(data);
                    intArr[numPos] = currentNum;
                    numPos++;
                }

                counter++;
            }

            Arrays.sort(intArr);
            for (int a : intArr)
                System.out.println(a);



            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
