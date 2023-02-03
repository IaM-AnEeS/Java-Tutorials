package com.company;
import java.util.Scanner;
import java.util.Random;
public class CWH_Ch4_20_RPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Random Rand = new Random();
        int comp_choice = (int)(Math.random()*3);
        System.out.println("0->Rock\n1->Paper\n2->Scissor\n");
        System.out.println("What do You chose...???");
        int user_choice = input.nextInt();

        // Game Logic
//        System.out.printf("You chose %d\n", user_choice);
        System.out.printf("Computer chose %d\n", comp_choice);

        if (comp_choice == user_choice) {
            System.out.println("Its a draw!");
        }
        else if (comp_choice == 0) {
            if (user_choice == 1) {
                System.out.println("You Won");
            }
            else if (user_choice == 2) {
                System.out.println("Computer Won");
            }
        }
        else if (comp_choice == 1) {
            if (user_choice == 0) {
                System.out.println("Computer Won");
            }
            else if (user_choice == 2) {
                System.out.println("You Won");
            }
        }
        else if (comp_choice == 2) {
            if (user_choice == 0) {
                System.out.println("You Won");
            }
            else if (user_choice == 1) {
                System.out.println("Computer Won");
            }
        }
    }
}