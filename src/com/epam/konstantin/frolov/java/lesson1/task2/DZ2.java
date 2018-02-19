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
            String smin,smax;
            smin=s[0];
            smax=s[0];
            int kmin,kmax;
            kmin=0;
            kmax=0;
            for (int i=1;i<n;i++){
                if (smin.length()>s[i].length()){
                    kmin=i;
                }
                if (smax.length()<s[i].length()){
                    kmax=i;
                }
            }
          System.out.println("Answer:");
          System.out.println("Min string: "+s[kmin]+" Min string Length: "+s[kmin].length());
          System.out.println("Max string: "+s[kmax]+" Max string Length: "+s[kmax].length());
    }
    public void getMoreThanSRZ(){
        int summ=0;
        for (int i=0;i<n;i++){
            summ=summ+s[i].length();
        }
        int srznach=summ/n;
        System.out.println("Answer:");
        for (int i=0;i<n;i++) {
            if (s[i].length()>srznach){
                System.out.println("String: "+s[i]+" Length: "+s[i].length());
            }
        }

    }
    public void getLessThanSRZ(){
        int summ=0;
        for (int i=0;i<n;i++){
            summ=summ+s[i].length();
        }
        int srznach=summ/n;
        System.out.println("Answer:");
        for (int i=0;i<n;i++) {
            if (s[i].length()<srznach){
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
        int kmin=0;
        for (int i=0;i<n;i++){
            if (k[kmin]>k[i]){
                kmin=i;
            }
        }
        System.out.println("Answer: "+w[kmin]);

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
        int kmin=0;
        while (k[kmin]!=1){
            kmin++;
        }


        System.out.println("Answer: "+w[kmin]);

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
        int kmin=0;
        while (k[kmin]!=1){
            kmin++;
        }
        int summ=0;
        for (int i=0;i<n;i++) {
            summ=summ+k[i];
        }
        if (summ==1){
            System.out.println("Answer: "+w[kmin]);
        }
        else {
            kmin++;
            while (k[kmin]!=1){
                kmin++;
            }
            System.out.println("Answer: "+w[kmin]);
        }

    }
}
