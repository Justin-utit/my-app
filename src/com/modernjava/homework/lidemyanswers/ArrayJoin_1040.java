package com.modernjava.homework.lidemyanswers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayJoin_1040 {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1040.txt");
            Scanner myReader = new Scanner(myObj);

            // 存input data (區域變數要手動給值)
            String str = null;
            int howManyNums = 0;
            int[] intArr = new int[0];

            // get input data
            int counter = 0;
            int tempIndex = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);

                if(counter==0)
                    str = data;

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
            StringBuilder sb = new StringBuilder();
            for(int i : intArr){
                sb.append(i);
                sb.append(str);
            }
            String result = sb.toString(); // "123"
            result = result.substring(0,result.length()-1);
            System.out.println(result);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
