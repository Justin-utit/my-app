package com.modernjava.homework.LIOJ;

import java.util.Scanner;

public class P1002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine())
        {
            String[] tokens = scanner.nextLine().split("\\s");
//            System.out.println(Arrays.toString(tokens));

            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);
            if(a==0 && b==0){
                return;
            }
            if (a > b) {
                System.out.println(a);
            } else if (a < b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }

        }

        scanner.close();

    }
}

/*
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();


        if(a==0 && b==0){

        }
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
 */