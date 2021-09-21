package com.modernjava.homework.lidemyanswers.a3c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayFilter_1037 {

    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1037.txt");
            Scanner myReader = new Scanner(myObj);

            // 存input data (區域變數要手動給值)
            int target = 0;
            int howManyNums = 0;
            int[] intArr = new int[0];

            // get input data
            int counter = 0;
            int tempIndex = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);

                if(counter==0)
                    target = Integer.valueOf(data);

                if(counter==1) {
                    howManyNums = Integer.valueOf(data);
                    intArr = new int[howManyNums];
                }


                if(counter>1){
                    intArr[tempIndex] = Integer.valueOf(data);
                    tempIndex++;
                }

                counter++;
            }

//            System.out.println(target);           // 3
//            System.out.println(howManyNums);      // 5

            // ------------------------------------------------ 以上拿到該拿的東西

            for(int i : intArr){
                if(i!=target){
                    System.out.println(i);
                }
            }


            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
