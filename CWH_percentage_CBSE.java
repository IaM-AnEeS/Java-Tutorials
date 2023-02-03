package com.company;
import java.util.Scanner;

public class CWH_percentage_CBSE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE FIRST SUJECT NUMBER:");
        int a=input.nextInt();
        System.out.println("ENTER SECOND SUBJECT NUMBER:");
        int b=input.nextInt();
        System.out.println("ENTER THE THIRD SUBJECT NUMBER:");
        int c=input.nextInt();
        System.out.println("ENTER THE FOURTH SUBJECT NUMBER:");
        int d=input.nextInt();
        System.out.println("ENTER THE FIVTH SUBJECT NUMBER:");
        int e=input.nextInt();
        int percent;
        percent= (a+b+c+d+e)*100/100;
        System.out.println("Your percentage is:" + percent);
    }

}
