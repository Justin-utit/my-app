package com.modernjava.prepare;

public class DataTypes_3 {

    public static void main(String[] args) {
        // 這就是變數宣告
        byte a;
        short b;
        int c; // 整數預設用 int
        long d;

        float e;
        double f; // 浮點數預設用 double

        boolean g;
        char h;

        // 變數宣告 並給值
        int myNum = 5;               // Integer (whole number)
        double myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        // 變數的型態分為兩種
        // 原始資料型態: byte, short, int, long, float, double, boolean and char
        // 非原始資料型態: such as String, Arrays and Classes (之後會學到)

        /* 原始資料型態
        Data Type	Size	Description
        byte	1 byte	Stores whole numbers from -128 to 127
        short	2 bytes	Stores whole numbers from -32,768 to 32,767
        int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	1 bit	Stores true or false values
        char	2 bytes	Stores a single character/letter or ASCII values
        */
        /*
        原始資料型態的 byte, short, int, long 為整數，預設使用int已經可以應付大部分的情況
        但long有一種比較常見的使用情境，用於時間的記錄，像是記錄程式開始執行的時間與結束的時間。

        記錄小數點的話用浮點數，預設用double, 但注意，double, float 不適合用於計算金錢，計算金錢用 BigDecimal (先知道這件事就好)
         */

        // 數字分兩種
        // 整數 (前4種) int(default)
        // 浮點數 float, double(default)

        // 整數
        byte myNum1 = 100;
        System.out.println(myNum);

        short myNum2 = 5000;
        System.out.println(myNum);

        // from -2147483648 to 2147483647.
        // the int data type is the preferred data type when we create variables with a numeric value.
        int myNum3 = 100000;
        System.out.println(myNum);

        // from -9223372036854775808 to 9223372036854775807
        // Note that you should end the value with an "L": 數字夠大，不加會錯
        long myNum4 = 15000000000L;
        long myNum5 = 9223372036854775807L;
        long myNum6 = 2147483647; // 這是最大可以不加L的數字
        System.out.println(myNum);


        // 浮點數 (float & double 是精確度的差別，詳見下方說明)
        // You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
        float myNum7 = 5.75f;
//        float myNum8 = 5.75; // 不加f會報錯
        System.out.println(myNum7);

        double myNum9 = 19.99d;
        double myNum10 = 19.99;
        System.out.println(myNum9);

        /*
        Use float or double?
        The precision of a floating point value indicates how many digits the value can have after the decimal point.
        The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits.
        Therefore it is safer to use double for most calculations.
         */

        // 實務上 沒人這樣寫
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1); // 35000.0
        System.out.println(d1); // 120000.0

        // 布林 - Boolean values are mostly used for conditional testing 之後學
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        // Characters 字元
        // The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
        char myGrade = 'a';
        System.out.println(myGrade);

        // 電腦間資料交換的編碼表 ASCII stands for the "American Standard Code for Information Interchange".
        // ASCII is a 7-bit character set containing 128 characters.
        // It contains the numbers from 0-9, the upper and lower case English letters from A to Z, and some special characters.
        // The following tables list the 128 ASCII characters and their equivalent number.
        char aa = 65, bb = 66, cc = 47;
        System.out.println(aa); // A
        System.out.println(bb); // B
        System.out.println(cc); // /
        System.out.println('\u0041'); // A

        // 印出來都A
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041'; // this is Unicode
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println();


        // 印出來都65
        int code1 = 'A';
        int code2 = '\u0041'; // this is Unicode


        // Unicode range: ['\u0000','\uffff'] or [0,65535]
        // Character to Unicode to Binary
        // Binary to Unicode to Character
        int code3 = '\uffff';
        System.out.println(code3);

        char c4 = '\uffff';
        System.out.println(c4);

        // 非 原始資料型態
        // 非 原始資料型態 參照到物件
        // -> Non-primitive data types are called reference types because they refer to objects.
        // 非 原始資料型態: 大寫開頭
        // -> A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

        // The size of a primitive type depends on the data type,
        // while non-primitive types have all the same size. (詳見下) (base: a bare Object takes up 16 bytes)

        // String
        // The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
        String greeting = "Hello World";
        System.out.println(greeting);

        /*
        General formula for calculating memory usage of Java objects
        In general, the heap memory used by a Java object in Hotspot consists of:

        1.an object header, consisting of a few bytes of "housekeeping" information;
        2.memory for primitive fields, according to their size (see below);
        3.memory for reference fields (4 bytes each);
        4.padding: potentially a few "wasted" unused bytes after the object data, to make every object start at an address that is a convenient multiple of bytes and reduce the number of bits required to represent a pointer to an object.

        Inevitably, they also require some "housekeeping" information,
        such as recording an object's class, ID and status flags such as whether the object is currently reachable,
        currently synchronization-locked etc.

        In Hotspot, the following generally holds:
        a normal object requires 12 bytes of "housekeeping" space (note that this was 8 bytes in earlier JVMs);
        arrays require 16 bytes (the same as a normal object, plus 4 bytes for the array length).
         */


    }


}
