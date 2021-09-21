package com.modernjava.homework.lidemyanswers.a4c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 圈圈叉叉_1046 {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1046_2.txt");
            Scanner myReader = new Scanner(myObj);

            char[][] char2DArr = new char[3][3];
            int i = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data); // OOO
                char[] charArr = data.toCharArray();
                char2DArr[i] = charArr;
                i++;
            }
            System.out.println();
            // int2DArr[][]

            // 橫
            for(int j = 0; j < 3; j++){ // 0 1 2
                char[] hLine = char2DArr[j]; // 横線
                char x1 = hLine[0];
                char x2 = hLine[1];
                char x3 = hLine[2];
                if(x1==x2 && x2==x3 && x1=='O') {
                    System.out.println('O');
                    return; // 程式停止執行
                } else if(x1==x2 && x2==x3 && x1=='X') {
                    System.out.println('X');
                    return; // 程式停止執行
                }
            }

            // int2DArr[][]
            // 直
            char[] l1 = char2DArr[0];
            char[] l2 = char2DArr[1];
            char[] l3 = char2DArr[2];
            for(int j = 0; j<3; j++){
                char y1 = l1[j];
                char y2 = l2[j];
                char y3 = l3[j];
                if(y1==y2 && y2==y3 && y1=='O') {
                    System.out.println('O');
                    return; // 程式停止執行
                } else if(y1==y2 && y2==y3 && y1=='X') {
                    System.out.println('X');
                    return; // 程式停止執行
                }
            }

            // 斜(左上到右下)
            char a = l1[0];
            char b = l2[1]; // 中心點
            char c = l3[2];
            if(a==b && b==c && a=='O') {
                System.out.println('O');
                return; // 程式停止執行
            } else if(a==b && b==c && a=='X') {
                System.out.println('X');
                return; // 程式停止執行
            }

            // 斜(右上到左下)
            char d = l1[2];
            char e = l3[0];
            if(d==b && b==e && d=='O') {
                System.out.println('O');
                return; // 程式停止執行
            } else if(d==b && b==e && d=='X') {
                System.out.println('X');
                return; // 程式停止執行
            }

            // 沒人連成一線，即…
            System.out.println("DRAW");

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String tellWhoWins(){



        return null;
    }
}
