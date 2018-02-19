package com.epam.konstantin.frolov.java.lesson1.task1;

public class DZ1 {
    private static int a[];
    public static void genMass() {
        a=new int[20];
        for (int i = 0; i < 20; i++){
            a[i]=(int)(Math.random()*21-10);
        }
        System.out.println("initial array:");
        for (int i=0;i<20;i++)
            System.out.print(a[i]+ " ");
        System.out.println();

    }

    public static void one(){
        int bufArr[]=new int [20];
        System.arraycopy(a,0,bufArr,0,20);
        int maxotr = -1,minpol=-1,maxotrel,minpolel;
        maxotrel=-11;
        minpolel=11;
        for (int i=0;i<20;i++){
            if ((bufArr[i]>0)&&(bufArr[i]<minpolel)) {
                minpol = i;
                minpolel=bufArr[i];
            }
            if ((bufArr[i]<0)&&(bufArr[i]>maxotrel)) {
                maxotr = i;
                maxotrel=bufArr[i];
            }
        }
        int buf;
        buf=bufArr[maxotr];
        bufArr[maxotr]=bufArr[minpol];
        bufArr[minpol]=buf;
        System.out.println("array after work:");
        for (int i=0;i<20;i++)
            System.out.print(bufArr[i]+ " ");
        System.out.println();
    }

    public static void two(){
        int bufArr[]=new int [20];
        System.arraycopy(a,0,bufArr,0,20);
        int s=0;
        for (int i=0;i<20;i+=2){
            s=s+bufArr[i];
        }
        System.out.println("Summ on index/2:");
        System.out.println(s);
    }

    public static void three(){
        int bufArr[]=new int [20];
        System.arraycopy(a,0,bufArr,0,20);
        for (int i=0;i<20;i++){
            if (bufArr[i]<0)
                bufArr[i]=0;
        }
        System.out.println("array after work:");
        for (int i=0;i<20;i++)
            System.out.print(bufArr[i]+ " ");
        System.out.println();
    }

    public static void four(){
        int bufArr[]=new int [20];
        System.arraycopy(a,0,bufArr,0,20);
        for (int i=1;i<20;i++){
            if (bufArr[i-1]<0&&bufArr[i]>0)
                bufArr[i]=bufArr[i]*3;
        }
        System.out.println("array after work:");
        for (int i=0;i<20;i++)
            System.out.print(bufArr[i]+ " ");
        System.out.println();
    }

    public static void five(){
        int bufArr[]=new int [20];
        System.arraycopy(a,0,bufArr,0,20);
        int min = -1,minel;
        minel=-11;
        for (int i=0;i<20;i++){
           if (bufArr[i]<minel){
               minel=bufArr[i];
               min=i;
           }
        }
        int sum=0;
        double srznach;
        for (int i=0;i<20;i++){
            sum=sum+bufArr[i];
        }
        srznach=sum/20;
        double ans=srznach-minel;
        System.out.println("answer:");
        System.out.println(ans);

    }

    public static void six(){
        int bufArr[]=new int [20];
        System.arraycopy(a,0,bufArr,0,20);
        System.out.println("answer:");
        for (int i=0;i<20;i++) {
            for (int j=i+1;j<20;j++){
                if ((bufArr[i]==bufArr[j])&&(i%2==1))
                    System.out.print(bufArr[i]+" ");
            }
        }
        System.out.println();
    }
}