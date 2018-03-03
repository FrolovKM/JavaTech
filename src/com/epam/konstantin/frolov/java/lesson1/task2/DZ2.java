package com.epam.konstantin.frolov.java.lesson1.task2;

import java.util.Scanner;

public class DZ2 {
    private String s[],w[];
    private int n;

    public void getString() {
        System.out.print("Enter number of strings: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        s = new String[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            s[i] = in.nextLine();
        }
    }
      public void getMinMax(){
            String sMin,sMax;//string with min/max number of elements
            sMin=s[0];
            sMax=s[0];
            int kMin,kMax;//index of string with min/max number of elements
            kMin=0;
            kMax=0;
            for (int i=1;i<n;i++){
                if (sMin.length()>s[i].length()){
                    kMin=i;
                }
                if (sMax.length()<s[i].length()){
                    kMax=i;
                }
            }
          System.out.println("Answer:");
          System.out.println("Min string: "+s[kMin]+" Min string Length: "+s[kMin].length());
          System.out.println("Max string: "+s[kMax]+" Max string Length: "+s[kMax].length());
    }
    public void getMoreThanSRZ(){
        int summ=0;
        for (int i=0;i<n;i++){
            summ=summ+s[i].length();
        }
        int srZnach=summ/n;
        System.out.println("Answer:");
        for (int i=0;i<n;i++) {
            if (s[i].length()>srZnach){
                System.out.println("String: "+s[i]+" Length: "+s[i].length());
            }
        }

    }
    public void getLessThanSRZ(){
        int summ=0;
        for (int i=0;i<n;i++){
            summ=summ+s[i].length();
        }
        int srZnach=summ/n;
        System.out.println("Answer:");
        for (int i=0;i<n;i++) {
            if (s[i].length()<srZnach){
                System.out.println("String: "+s[i]+" Length: "+s[i].length());
            }
        }
    }
    public void getWords(){
        System.out.print("Enter number of words: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        w = new String[n];

        for (int i = 0; i < n; i++) {
            w[i] = in.next();
        }

    }
    public void getWordsWithMinDiffEl(){
        int k[]=new int[n];

        for (int i=0;i<n;i++){
            k[i]=0;

            for (int j=0;j<w[i].length();j++){
                Boolean flag=true;
                for (int q=0;q<w[i].length();q++){
                    if ((w[i].charAt(q)==w[i].charAt(j))&&(j!=q)){
                        flag=false;
                    }
                }
                if (flag==true){
                    k[i]++;
                }
            }

        }
        int kMin=0;//index
        for (int i=0;i<n;i++){
            if (k[kMin]>k[i]){
                kMin=i;
            }
        }
        System.out.println("Answer: "+w[kMin]);

    }

    public void getWordsWithDiffEl(){
        int k[]=new int[n];

        for (int i=0;i<n;i++){
            k[i]=0;
            Boolean flag=true;
            for (int j=0;j<w[i].length();j++){
               for (int q=0;q<w[i].length();q++){
                    if ((w[i].charAt(q)==w[i].charAt(j))&&(j!=q)){
                        flag=false;
                    }
                }
            }
            if (flag==true){
                k[i]=1;
            }

        }
        int kMin=0;//index
        while (k[kMin]!=1){
            kMin++;
        }
        System.out.println("Answer: "+w[kMin]);

    }

    public void getWordsOnlyWithNumbers(){
        int k[]=new int[n];
        for (int i=0;i<n;i++) {
            k[i] = 0;
            Boolean flag = true;
            for (int j = 0; j < w[i].length(); j++) {
                if (w[i].charAt(j) != '1' && w[i].charAt(j) != '2' && w[i].charAt(j) != '3' && w[i].charAt(j) != '4' && w[i].charAt(j) != '5' && w[i].charAt(j) != '6' && w[i].charAt(j) != '7' && w[i].charAt(j) != '8' && w[i].charAt(j) != '9' && w[i].charAt(j) != '0') {
                    flag = false;
                }
            }
            if (flag == true) {
                k[i] = 1;
            }
        }
        int kMin=0;//index
        while (k[kMin]!=1){
            kMin++;
        }
        int summ=0;
        for (int i=0;i<n;i++) {
            summ=summ+k[i];
        }
        if (summ==1){
            System.out.println("Answer: "+w[kMin]);
        }
        else {
            kMin++;
            while (k[kMin]!=1){
                kMin++;
            }
            System.out.println("Answer: "+w[kMin]);
        }

    }
}
