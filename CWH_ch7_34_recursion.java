package com.company;
import java.util.Scanner;

public class CWH_ch7_34_recursion {
    static int fac(int n) {
        if(n==0 ||n==1){
            return 1;
        }
        else
            return n*fac(n-1);
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){ // 1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
        System.out.println("Enter the number you want a factorial of ");
        int num=input.nextInt();
        System.out.println("The factorial of "+"num"+" is "+fac(num) );
    }
}
