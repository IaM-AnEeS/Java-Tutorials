package com.company;

public class CWH_ch5_24_Conbreak{
    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            System.out.println(i);
            System.out.println("Java is Fantastic");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        int i=0;
        while (i<10){
            System.out.println(i);
            System.out.println("java is great");
            if(i==5){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
        System.out.println("Loops ends here");

        int a=0;
        do{
            System.out.println(a);
            System.out.println("java is great");
            if(a==5) {
                System.out.println("Ending the loop");
                break;
            }
            a++;
        }while(a<10);
        System.out.println("Loops ends here");
//        if(i==2){
//                System.out.println("Ending the loop");
//                continue;
//            }
//                System.out.println(i);
//                System.out.println("Java is great");
//        }
            int b=0;
            do{
                b++;
                if(b==2){
                    System.out.println("Ending the loop");
                    continue;
                }
                System.out.println(b);
                System.out.println("Java is great");

            }while(b<5);
            System.out.println("Loop ends here");
    }
}
