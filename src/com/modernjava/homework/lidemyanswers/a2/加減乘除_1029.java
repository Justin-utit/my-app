package com.modernjava.homework.lidemyanswers.a2;

public class 加減乘除_1029 {
    public static void main(String[] args) {
        String str = "3 * 4";
        int result = calculate(str);
        System.out.println("計算結果: "+result);
    }

    public static int calculate(String str){
        String[] strArr = str.split(" ");
        String operator = strArr[1];
        int a = Integer.valueOf(strArr[0]);
        int b = Integer.valueOf(strArr[2]);
        switch (operator){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:
                System.out.println("something wrong!");
        }

        return 0;
    }
}
