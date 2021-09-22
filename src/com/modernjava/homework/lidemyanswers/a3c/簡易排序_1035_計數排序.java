package com.modernjava.homework.lidemyanswers.a3c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 簡易排序_1035_計數排序 {

    public static void main(String[] args) {

        // 從檔案把資料讀進來
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1035_計數排序.txt");
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

            // 這是使用內建函式
//            Arrays.sort(intArr);
//            for (int a : intArr)
//                System.out.println(a);

            // 也可以使用計算排序: counting sort
            // 使用情境: 要排序的數字雖多，但範圍不大時
            // 例如: 有200000個數字要排序，但數字的範圍只能從1-100，這時侯就先準備好1-100的容器，把1全放入1容器，2全放入2容器，依此類推

            int[] intCounter = new int[100];
            for(int i=0; i<intArr.length; i++){
                int currentNum = intArr[i]; // currentNum-> 第1個數字-> index=0
                // 應該+1的格子 加1後存回:
                intCounter[currentNum-1] = intCounter[currentNum-1] + 1;
            }

            for(int i = 0; i< intCounter.length; i++){
                int numInThisBox = intCounter[i];
                for(int j = 0; j<numInThisBox; j++){ // 次數
                    // 數字
                    System.out.println(i+1);
                }
            }


            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
