package com.modernjava.homework.lidemyanswers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayReverse_1036 {

    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/input_1036_2.txt");
            Scanner myReader = new Scanner(myObj);

            int[] intArr = new int[101];
            int i = 0;
            int firstNum = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);

                if(i==0) {
                    firstNum = Integer.valueOf(data);
                    i++;
                    continue;
                }

                intArr[i-1] = Integer.valueOf(data);
                i++;
            }

//            System.out.println(firstNum); // 3
//            System.out.println(intArr); // 1 2 3

            for(int j = firstNum-1; j>=0; j--){
                System.out.println(intArr[j]);
            }


            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
