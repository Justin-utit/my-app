package com.modernjava.prepare.forty;

import java.util.ArrayList;

/*
    λ      表達式
    Lambda Expressions were added in Java 8.

    一個傳入參數，之後回傳值的語法
    A lambda expression is a short block of code which takes in parameters and returns a value.

    Lambda expressions are similar to methods,
    類似方法，但不需要方法名稱
    but they do not need a name and they can be implemented right in the body of a method.

    Syntax
    The simplest lambda expression contains a single parameter and an expression:
    parameter -> expression

    To use more than one parameter, wrap them in parentheses:
    (parameter1, parameter2) -> expression

    public int sum(int num, int num2){

        if(){

        }

        for(){

        }

        return num+num2;
    }

    限制:
    Expressions are limited. They have to immediately return a value, and they cannot contain variables,
    assignments or statements such as if or for.
    In order to do more complex operations, a code block can be used with curly braces.

    If the lambda expression needs to return a value, then the code block should have a return statement.

    不想記就直接這樣寫，就解除限制了
    (parameter1, parameter2) -> { code block }
    (parameter1) -> { code block }
 */
public class LambdaExpression_42 {
    public static void main(String[] args) {
        // lambda expressions are usually passed as parameters to a function:
        // Use a lamba expression in the ArrayList's forEach() method to print every item in the list:
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        String[] strArr = {"1","2","3"};
        for(String n : strArr){
            System.out.println(n);
        }
        System.out.println();

        numbers.forEach(          (n) -> { System.out.println(n); }            );
    }

    public int addOne(int num){
        int a = 0;
        return num++;
    }

}
