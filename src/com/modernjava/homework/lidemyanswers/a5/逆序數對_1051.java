package com.modernjava.homework.lidemyanswers.a5;

/*
        0   1   2   3   4
        1   9   2   7   3

        2個數字:
        index小 但 值大
        index大 但 值小

        (9, 2), (9, 7), (9, 3), (7, 3) 這四組都是逆序數對

 */
public class 逆序數對_1051 {
    public static void main(String[] args) {

        int num = 5;
        String str = "5 4 3 2 1";
        String[] strArr = str.split(" ");
        int[] intArr = new int[strArr.length];
        int pos = 0;
        for (String s : strArr){
            intArr[pos] = Integer.valueOf(s);
            pos++;
        }

        int inverseNumPair = 0;
        for(int i = 0; i<num; i++){
            for(int j = i+1; j<num; j++){
                if(intArr[i]>intArr[j])
                    inverseNumPair++;
            }
        }

        System.out.println("逆序數對: " + inverseNumPair);
    }
}














