package com.company;
import java.util.Scanner;
public class CWH_ch7_31_Methods {
    public static void main(String[] args) {
//        Method invocation using object creation
        CWH_ch7_31_Methods obj=new CWH_ch7_31_Methods();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=input.nextInt();
        System.out.println("Enter the value of b:");
        int b=input.nextInt();
        int c=mul(a,b);
        System.out.println("The Answer is "+c);
        System.out.println("Enter the value of a1:");
        int a1=input.nextInt();
        System.out.println("Enter the value of b1:");
        int b1=input.nextInt();
        int c1=mul(a1,b1);
        System.out.println("The Answer is "+c1);
    }
 static int mul( int x ,int y){
        int z;
        if(x>y){
            z=x*y;
        }
        else{
            z=x+y;
        }
        return z;
    }
}
