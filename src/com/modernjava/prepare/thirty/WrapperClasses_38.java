package com.modernjava.prepare.thirty;

import java.util.ArrayList;
import java.util.List;

/*
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

Primitive Data Type	Wrapper Class
    byte	<->   Byte (byte -> Bype : auto boxing) (Byte -> byte : auto unboxing)
    short	Short
    int	    Integer
    long	Long
    float	Float
    double	Double
    boolean	Boolean
    char	Character
    使用情境:
   Sometimes you must use wrapper classes, for example when working with Collection objects,
   such as ArrayList, where primitive types cannot be used (the list can only store objects):
 */
public class WrapperClasses_38 {
    public static void main(String[] args) {

//        System.out.println(Integer.MAX_VALUE);

        // 容器內的形態宣告，只能用wrapper class
        List<Integer> list =  new ArrayList<>();

        int primitiveNum = 10;
        Integer classNum = primitiveNum; // auto boxing
        int primitiveNum2 = classNum; // auto unboxing

        // web app -> spring framework

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // Since you're now working with objects, you can use certain methods to get information about the specific object.
        // …
//        System.out.println(myInt.intValue());
//        System.out.println(myDouble.doubleValue());
//        System.out.println(myChar.charValue());

        Integer myInt2 = 100;
        String myString = myInt2.toString();

        System.out.println(myString.length());
    }
}
