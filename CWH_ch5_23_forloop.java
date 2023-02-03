package com.company;
import java.util.Scanner;
public class CWH_ch5_23_forloop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
//       2i= is for even numbers
//       2i+1 is for odd numbers
        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.println(2 * i + 1);
        }
        System.out.println("How many odd number u want too print");
        int num=input.nextInt();
        for (int i=num; i!=0;i--)
            System.out.println(2*i+1);

    }
}
