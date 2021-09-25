package com.modernjava.homework.lidemyanswers.a0;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 聯誼門票搶起來_1003 {

    public static void main(String[] args) {
        // 從檔案把資料讀進來
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1003.txt");
            Scanner myReader = new Scanner(myObj);

            int counter = 0;
            int firstNum = 0;
            int secondNum = 0;

            String[] strArr = new String[0];
            int pos1 = 0;
            int[] intArr = new int[0];
            int pos2 = 0;

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                if(counter==0) {
                    firstNum = Integer.valueOf(data); // 2
                    strArr = new String[firstNum];
                } else if (counter<(firstNum+1)){
                    strArr[pos1] = data;
                    pos1++;
                }

                if(counter==(firstNum+1)) { // 3
                    secondNum = Integer.valueOf(data);
                    intArr = new int[secondNum];
                } else if (counter>(firstNum+1)){
                    intArr[pos2] = Integer.valueOf(data);
                    pos2++;
                }

                counter++;
            }

            String str = "";
            for(String s : strArr){
                str+=s;
            }
            // yoman
            char[] chars = str.toCharArray(); // yoman
            String result = "";
            for(int i : intArr){
                result += chars[i-1];
            }

            System.out.println("result: "+result);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
