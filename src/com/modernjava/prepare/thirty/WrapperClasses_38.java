package com.modernjava.prepare.thirty;
/*
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

Primitive Data Type	Wrapper Class
    byte	Byte
    short	Short
    int	    Integer
    long	Long
    float	Float
    double	Double
    boolean	Boolean
    char	Character
   Sometimes you must use wrapper classes, for example when working with Collection objects,
   such as ArrayList, where primitive types cannot be used (the list can only store objects):
 */
public class WrapperClasses_38 {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // Since you're now working with objects, you can use certain methods to get information about the specific object.
        // …
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length());
    }
}
