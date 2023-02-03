package com.company;
import java.util.Scanner;

public class CWH_05_Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.println("ENTER THE VALUE OF a: ");
        a=input.nextInt();
        System.out.println("ENTER THE VALUE OF b:");
        b=input.nextInt();
        c=a*b;
        System.out.println("THE VALUE OF c:" + c);
    }
}
