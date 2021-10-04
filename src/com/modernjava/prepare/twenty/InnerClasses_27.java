package com.modernjava.prepare.twenty;
/*
    In Java, it is also possible to nest classes (a class within a class).
    目的 The purpose of nested classes is to group classes that belong together,
    which makes your code more readable and maintainable.

    To access the inner class, create an object of the outer class,
    and then create an object of the inner class:
 */

class OuterClass {

    int outerVar = 10;
    public void outerClassMethod(){
        System.out.println("myTempMethod");
    }

    class InnerClass {
        int innerVar = 5;
        public void innerClassMethod() {
            // access attributes and methods of the outer class
            outerClassMethod();
            System.out.println(outerVar);
        }

        public void outerClassMethod(){
            System.out.println("xxx");
        }
    }

    // If you don't want outside objects to access the inner class, declare the class as private:
    private class InnerClass2 {
        int innerVar2 = 2;
    }

    static class InnerClass3 {
        int innverVar3 = 3;
    }


}

public class InnerClasses_27 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass(); // 一般的new
        OuterClass.InnerClass myInner = myOuter.new InnerClass(); // 取得該inner class

        myOuter.outerClassMethod();
        myInner.innerClassMethod();    // inner class 可以透過method存取 outer class，但不能直接存取。
        System.out.println(myOuter.outerVar); // 可直取自己的實體變數
        System.out.println(myInner.innerVar); // 可直取自己的實體變數


        // 若為static的inner class, 就可以直接存取該inner class 不用new
        OuterClass.InnerClass3 myInner3 = new OuterClass.InnerClass3();
        System.out.println(myInner3.innverVar3);


        // One advantage of inner classes,
        // is that they can access attributes and methods of the outer class:
        // via its method (上有實例)，但必須透過自己的方法才可以，不能直接拿外面的
        myInner.innerClassMethod();


        // 補充: inner class 本身實務上不算太常用到，不過會出現於程式庫 或 google來的solutions, 所以還是大概得知道一下
    }
}





















