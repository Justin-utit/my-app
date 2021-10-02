package com.modernjava.prepare.one;

public class Variables_2 {

    static int number; //

    public static void main1() {
        number = 1;
    }
    public static void main2() {
        number = 2;
    }

    public static void main (String[] args) {

        main2(); // 2

        main1(); // 1

        System.out.println(number); // 1




        // 這就是變數宣告
        byte a; // -1 0 1
        short b;
        int c; // 整數預設用 int
        long d;

        float e; // 1.1
        double f; // 浮點數預設用 double

        boolean g;
        char h;

        // 變數宣告 並給值
        // The equal sign is used to assign values to the variable. 可以理解為 <-
        int myNum = 5;               // without decimals, such as 123 or -123
        double myFloatNum = 5.99f;    // with decimals, such as 19.99 or -19.99

        char myLetter = 'd';         // 字元 Character

        String word = "Justin Chen"; // 字串

        boolean myBool = false;       // Boolean  1 ture yes pass  <->  0 false no fail

        // 印出來
        System.out.println(myNum);

        // 先宣告，後給值
        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

        // 改變現有的值
        int myNum3 = 15;
        myNum3 = 20;  // myNum is now 20
        System.out.println(myNum3);


        // Java 以分號做為一行程式的終結，看到; 即完成該行程式
//        System.out.println(20);System.out.println(30);System.out.println(40);



        // 把變數變成read only, 通常會用於常數的宣告，像是圓周率
        // final int myNum4 = 15;
        // myNum4 = 20;  // will generate an error: cannot assign a value to a final variable

        // 數字
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        // 多個變數的型態一樣時

        int a1,b1,c1;
        int x1 = 5, y1 = 6, z1 = 50;
        System.out.println(x1 + y1 + z1);

        // 字串
        String xxx;
        xxx = "Justin";

        String name = "John";
        System.out.println(name);

        // 串接 1 (數字+為數學運算，字串+為串接)
        String name2 = "Liu";

        System.out.println(name + " - " + name2);

        System.out.println("Hello " + name2);

        // 串接 2
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);


        // 宣告兩個字串

        // 分別儲存自己的姓與名

        // 把自己的姓名印出來 (中間需要一個空格)





        // 命名
        // Good
        int minutesPerHour = 60;

        // int 時速 = 61;
        // System.out.println(時速);

        // OK, but not so easy to understand what m actually is
        int m = 60;

        // 命名的通則與規則:
        // 不可以用數字開頭
        // 除了類別名稱以外，第一個字為小寫
        // 如果是兩個字，像是 get age, 請寫成getAge, 變數中間不可有空白，也避免用_
        // 大小寫有別
        // 不可使用保留字 (int or boolean)

    }

}
