package com.epam.konstantin.frolov.java.lesson1;

import com.epam.konstantin.frolov.java.lesson1.task1.DZ1;
import com.epam.konstantin.frolov.java.lesson1.task2.DZ2;
import com.epam.konstantin.frolov.java.lesson1.task3.DZ3;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Choose option:");
        Scanner in = new Scanner (System.in);
        int key=in.nextInt();
        if (key==1) {
            System.out.print("Enter option: ");
            Scanner in1=new Scanner(System.in);
            int k1=in1.nextInt();
            if (k1==1) {
                DZ1.genMass();
                DZ1.one();
            }
            if (k1==2) {
                DZ1.genMass();
                DZ1.two();
            }
            if (k1==3){
                DZ1.genMass();
                DZ1.three();
            }
            if (k1==4){
                DZ1.genMass();
                DZ1.four();
            }
            if (k1==5){
                DZ1.genMass();
                DZ1.five();
            }
            if (k1==6){
                DZ1.genMass();
                DZ1.six();
            }
        }

        if (key==2){
            DZ2 dz2=new DZ2();
            System.out.print("Enter option: ");
            Scanner in1=new Scanner(System.in);
            int k1=in1.nextInt();
            if (k1==1) {
                dz2.getString();
                dz2.getMinMax();
            }
             if (k1==2) {
                dz2.getString();
                dz2.getMoreThanSRZ();
            }
            if (k1==3){
                dz2.getString();
                dz2.getLessThanSRZ();
            }
            if (k1==4){
                dz2.getWords();
                dz2.getWordsWithMinDiffEl();
            }
            if (k1==5){
                dz2.getWords();
                dz2.getWordsWithDiffEl();
            }
            if (k1==6){
                dz2.getWords();
                dz2.getWordsOnlyWithNumbers();
            }

        }
        if (key==3){
            System.out.print("Enter math operation ('+','-','*','/'): ");
            Scanner in1=new Scanner(System.in);
            String s=in1.next();
            char k1=s.charAt(0);
            if (k1=='+') {
               DZ3.readEl();
               DZ3.summ();
            }
            if (k1=='-') {
                DZ3.readEl();
                DZ3.sub();
            }
            if (k1=='*'){
                DZ3.readEl();
                DZ3.mul();
            }
            if (k1=='/'){
                DZ3.readEl();
                DZ3.div();
            }

        }
    }

}

