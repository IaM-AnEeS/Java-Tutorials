package com.company;
import java.util.Scanner;
public class CWH_ch5_25_PracticeSet {
    public static void main(String[] args) {
// Practice problem 1
        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.print("\n");
        }

        /* Practice set problem 2 */

        System.out.println("How much even number you want to add...??");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = sum + (2 * i);

        }
        System.out.println("The sum of " + num + " numbers is " + sum);

        /*Practice set problem 3*/

        System.out.println("Which number table u want in reverse order..? ");
        int numT = input.nextInt();
        for (int i = 1; i >= 10; i++) {
            System.out.printf("%d X %d = %d \n", numT, i, numT * i);
        }
//            Practice set problem 4

        System.out.println("Which number table u want in reverse order..? ");
        int numT2 = input.nextInt();
        for (int i = 10; i != 0; i--) {
            System.out.printf("%d X %d = %d \n", numT2, i, numT2 * i);
        }

//            Practice set Problem 5

        System.out.println("Enter the number you want factorial of..?");
        int facNum = input.nextInt();
        int Factorial = 1;
        for (int i = 1; i <= facNum; i++) {
            Factorial = Factorial * i;
        }
        System.out.println("The factorial of number " + facNum + " is " + Factorial);
//        Practice set Problem 6
        int n1 = 5;
//         What is factorial n = n * n-1 * n-2 ..... 1
//         5! = 5*4*3*2*1 = 120
        int i = 1;
        int factorial = 1;
        while (i <= n1) {
            factorial *= i;
            i++;
        }

//        Practice set problem 7

        System.out.println("How many line do u want to Write X in reverse Order...?");
        int Line = input.nextInt();
        while (Line > 0) {
            for (int j = 0; j < Line; j++) {
                System.out.print("X");
            }
            System.out.print("\n");
            Line--;
        }

//        Practice set problem 9

//        System.out.println("Which number table u want in reverse order..? ");
//            int numT3=input.nextInt();
//            int sum2=0;
//            for(int i=10; i!=0; i--) {
//                System.out.printf("%d X %d = %d \n", numT3, i, numT3 * i);
//                sum2 += numT3 * i;
//            }
//                  System.out.println(sum);

//            Practice set problem 11

        System.out.println("How much even number you want to add...??");
//        int num3 = input.nextInt();
//        int sum3=0;
//        int i=0;
//        while(num3>i){
//            sum3=sum3+(2*i);
//             i++;
//        }
//        System.out.println("The sum of "+num+" numbers is "+sum3);
    }

}
