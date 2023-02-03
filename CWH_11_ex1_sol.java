package com.company;
import java.util.Scanner;
public class CWH_11_ex1_sol {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the subject1 number: ");
        float subject1=input.nextFloat();
        System.out.println("Enter the subject2 number: ");
        float subject2=input.nextFloat();
        System.out.println("Enter the subject3 number: ");
        float subject3=input.nextFloat();
        System.out.println("Enter the subject4 number: ");
        float subject4=input.nextFloat();
        System.out.println("Enter the subject5 number: ");
        float subject5=input.nextFloat();
        float TotalSubject=subject1+subject2+subject3+subject4+subject5;
        float percent=TotalSubject*100/500;
        System.out.println("Total Marks out of "+500+" is "+TotalSubject);
        System.out.println("Your percentage is "+percent);


    }
}
