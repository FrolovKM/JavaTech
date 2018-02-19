package com.epam.konstantin.frolov.java.lesson1.task3;

import java.util.Scanner;

public class DZ3 {
    private static int a,b;

    public static void readEl(){
        System.out.println("Enter elements:");
        Scanner in = new Scanner (System.in);
        a=in.nextInt();
        b=in.nextInt();
    }

    public static void summ(){
        int c=a+b;
        System.out.println("Answer: "+c);

    }

    public static void sub(){
        System.out.print("Answer: ");
        System.out.println(a-b);
    }

    public static void mul(){
        System.out.print("Answer: ");
        System.out.println(a*b);
    }

    public static void div(){
        System.out.print("Answer: ");
        System.out.println(a/b);
    }
}
