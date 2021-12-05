package com.modernjava.prepare.thirty;

public class ExceptionTest {

    public static void main(String[] args) {

        System.out.println(1);




        try {
//            int[] intArr = {2,3}; // 0 1
//            System.out.println(intArr[1]);

            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }


        System.out.println(2);

    }
}
