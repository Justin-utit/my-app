package com.modernjava.prepare;

/*
    The public keyword is an access modifier,
    meaning that it is used to set the access level
    (重要)for classes, attributes, methods and constructors.
 */

//import com.modernjava.beginner.ModifiersC_21;

public class AccessModifiersA_21 {
    public static void main(String[] args) {

//        For classes, you can use either public or default:
//        The class is accessible by any other class
//        The class is only accessible by classes in the same package.
        new AccessModifiersB_21();
//        new ModifiersC_21();


        // For attributes, methods and constructors, you can use the one of the following:
        // 共有4種範圍，由大到小如下:
//        public		The code is accessible for all classes
//                      (for all classes 可以用這個當成基準點去思考，public是開放給全類別，其餘的就是只開放給部分類別存取)
//        protected	    The code is accessible in the same package and subclasses.
//                      You will learn more about subclasses and superclasses in the Inheritance chapter
//        default		The code is only accessible in the same package.
//                      This is used when you don't specify a modifier.
//                      You will learn more about packages in the Packages chapter
//        private		The code is only accessible within the declared class




    }
}

















