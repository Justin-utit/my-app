package com.modernjava.homework.lidemyanswers.a4c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 最大連續和_1048 {



    public static void main(String[] args) {
        // 從檔案把資料讀進來
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1048_2.txt");
            Scanner myReader = new Scanner(myObj);
                /* 5:   2  -3  5  -3  7
                    連2
                    連3
                    連4
                    連5
                     */

            int firstNum = 0;
            int[] intArr = new int[0];
            int index = 0;

            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                if(counter==0){
                    firstNum = Integer.valueOf(data);
                    intArr = new int[firstNum];
                } else {
                    intArr[index] = Integer.valueOf(data);
                    index++;
                }
                counter++;
            }
            /*
                2 -3 5 -3 7
             */
            int boxSize = 0;
            for(int i = firstNum; i>0; i--){
                boxSize+=i;
            }
            int[] collectAllInt = new int[boxSize]; // 10
            int pos = 0;

            for (int i = 0; i<intArr.length; i++){ // 0, 1, 2, 3, 4
                int sum = intArr[i];
                for(int j = i+1; j<intArr.length; j++){
                    sum += intArr[j]; // 0+1
                    collectAllInt[pos] = sum;
                    pos++;
                }
            }

            /*
            0, 1, 2, 3, 4

            5

            0 1
            0 1 2
            0 1 2 3
            0 1 2 3 4

            1 2
            1 2 3
            1 2 3 4

            2 3
            2 3 4

            3 4


             */

            int max = collectAllInt[0];
            for(int i = 1; i<collectAllInt.length; i++){
                if(collectAllInt[i]>max)
                    max = collectAllInt[i];
            }

            System.out.println("最大: " + max);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
