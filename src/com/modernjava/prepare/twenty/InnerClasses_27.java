package com.modernjava.prepare.twenty;
/*
    In Java, it is also possible to nest classes (a class within a class).
    The purpose of nested classes is to group classes that belong together,
    which makes your code more readable and maintainable.

    To access the inner class, create an object of the outer class,
    and then create an object of the inner class:
 */

class OuterClass {

    int x = 10;

    class InnerClass {
        int y = 5;
        public int myInnerMethod() {
            // access attributes and methods of the outer class
            myTempMethod();
            return x;
        }
    }

    // If you don't want outside objects to access the inner class, declare the class as private:
    private class InnerClass2 {
        int y = 5;
    }

    static class InnerClass3 {
        int y = 6;
    }

    public void myTempMethod(){
        System.out.println("myTempMethod");
    }
}

public class InnerClasses_27 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

        OuterClass.InnerClass3 myInner3 = new OuterClass.InnerClass3();
        System.out.println(myInner3.y);

        // One advantage of inner classes,
        // is that they can access attributes and methods of the outer class:
        System.out.println(myInner.myInnerMethod());
    }
}





















