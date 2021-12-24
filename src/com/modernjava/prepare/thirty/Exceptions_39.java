package com.modernjava.prepare.thirty;
/*
Java Exceptions
    When executing Java code, different errors can occur: coding errors made by the programmer,
    errors due to wrong input, or other unforeseeable things.
    When an error occurs, Java will normally stop and generate an error message.
    The technical term for this is: Java will throw an exception (throw an error).

    The try statement allows you to define a block of code to be tested for errors while it is being executed.
    The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
    The try and catch keywords come in pairs:
 */
public class Exceptions_39 {
    public static void main(String[] args)  {


        try {
            temp(); // 潛在會丟出來的例外錯誤
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }


//        try {
//            //  Block of code to try
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]); // error!
//        }
//        catch(Exception e) {
//            //  Block of code to handle errors
//            System.out.println("Something went wrong.");
//        }
//
//        // xxx
//
//
//
//        try{
//            // 可能出錯的程式碼區塊
//        } catch (Exception e){
//            // 出錯後，會進來執行的區塊
//            // System.out.println(e.getMessage());
//        }
//
//        /*
//        Finally
//            The finally statement lets you execute code, after try...catch, regardless of the result:
//         */
//        try {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
//
//            // IO
//            // 把文字寫進某個檔案 Input
//            // 從某個檔案讀出文字 Output
//            // 套件
//
//        } catch (Exception e) {
//            System.out.println("Something went wrong.");
//        } finally {
//            System.out.println("The 'try catch' is finished.");
//            // io.close();
//        }
//
//        /*
//        The throw keyword
//        The throw statement allows you to create a custom error.
//        The throw statement is used together with an exception type.
//        There are many exception types available in Java:
//        ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
//         */
//
//        checkAge(15); // Set age to 15 (which is below 18...)
//        checkAge(20);


    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    static void temp() throws Exception{

//        int[] myNumbers = {1, 2, 3};
//        System.out.println(myNumbers[10]); // error!

        temp2();
    }

    static void temp2() throws Exception{

        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!


    }

}
