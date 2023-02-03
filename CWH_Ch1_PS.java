package com.company;

import java.util.Scanner;

public class CWH_Ch1_PS {
    public static void main(String[] args) {
//        Question1
        int a,b,c,sum;
        a=3;
        b=4;
        c=4;
       sum=a+b+c;
        System.out.println(sum);
//        Question2
        float subject1=45F;
        float subject2=55F;
        float subject3=89F;
        float CGPA=(subject1+subject2+subject3)/30F;
        System.out.println(CGPA);
//        Question3
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= input.next();
        System.out.println("Hello "+name+" have a good day");
//        Question no 4
        System.out.println("Enter Kilometer");
        float kilo= input.nextFloat();
        float mile=kilo*0.62137119F;
        System.out.println(mile+"mile");
//        Question5
        System.out.println("Enter an Integer ");
        System.out.println(input.hasNextInt());


    }
}
