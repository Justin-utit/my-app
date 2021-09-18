package com.modernjava.homework.lidemyanswers;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
    使用.pow() -> 平方 e.g. Math.pow(10, 2); // 10的 2次方
    或是.sqrt() -> 開根號 e.g. 100開根號 : Math.sqrt(100);

    使用Math.abs()來進行計算絕對值
    int A1=10, B1=20;
    Math.abs( A - B )；

    小數點後2位
    double d1 = 3.14159;
    DecimalFormat df = new DecimalFormat("##.00");
    d1 = Double.parseDouble(df.format(d1));

    2
        1
        1
        2
        2
            1.41(兩點間的距離)  x1 y1   x2 y2
        3
        3
        4
        4
 */
public class 平面距離計算_1032 {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1032.txt");
            Scanner myReader = new Scanner(myObj);

            StringBuilder sb = new StringBuilder();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // System.out.println(data);
                sb.append(data);
            }

            String data = sb.toString(); // 2 11223344
            int setOfNumbers = Integer.valueOf(data.substring(0,1));
            String dataSet = data.substring(1); // 11223344

            int start = 0;
            int end = 4;
            for(int i = 0; i<setOfNumbers; i++){ // 0 1

                String currentDataSet = dataSet.substring(start, end); // 1122 -> x1,y1,x2,y2
                int x1 = Integer.valueOf(currentDataSet.substring(0,1));
                int y1 = Integer.valueOf(currentDataSet.substring(1,2));
                int x2 = Integer.valueOf(currentDataSet.substring(2,3));
                int y2 = Integer.valueOf(currentDataSet.substring(3,4));
//                System.out.println(""+x1+y1+x2+y2);
                double distanceOf2points = Math.sqrt(Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2));
                DecimalFormat df = new DecimalFormat("##.00");
                distanceOf2points = Double.parseDouble(df.format(distanceOf2points));
                System.out.println(distanceOf2points); // 輸出結果

                start+=4;
                end+=4;
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
