package com.modernjava.homework.lidemyanswers.a4c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 陣列最短距離_1049 {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1049.txt");
            Scanner myReader = new Scanner(myObj);
            int n = 0;
            int m = 0;
            int[] intArr1 = new int[0];
            int[] intArr2 = new int[0];
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                if(counter==0){
                    n = Integer.valueOf(data.split(" ")[0]);
                    m = Integer.valueOf(data.split(" ")[1]);
                    intArr1 = new int[n];
                    intArr2 = new int[m];
                } else if (counter==1){
                    String[] strArr = data.split(" ");
                    for(int i = 0; i<intArr1.length; i++){
                        intArr1[i] = Integer.valueOf(strArr[i]);
                    }
                } else {
                    String[] strArr = data.split(" ");
                    for(int i = 0; i<intArr2.length; i++){
                        intArr2[i] = Integer.valueOf(strArr[i]);
                    }
                }
                counter++;
            }
            /*
            5 5
            1 9 12 15 18
            3 6 10 11 12
             */
            int[] storeAllSubstractedSum = new int[n*m];
            int pos = 0;
            for(int i = 0; i< intArr1.length; i++){

                for(int j = 0; j< intArr2.length; j++){

                    storeAllSubstractedSum[pos] = Math.abs(intArr1[i] - intArr2[j]);
                    pos++;
                }

            }

            int min = storeAllSubstractedSum[0];
            for(int i = 1; i<storeAllSubstractedSum.length; i++){
                if(storeAllSubstractedSum[i]<min){
                    min = storeAllSubstractedSum[i];
                }
            }

            System.out.println("最小距離: "+min);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
