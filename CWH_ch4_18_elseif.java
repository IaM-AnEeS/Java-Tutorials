package com.company;
import java.util.Scanner;
public class CWH_ch4_18_elseif {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("Enter a day");
        int day=input.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enjoy you weekend");
        }


        System.out.println("Enter your age: ");
        int age=input.nextInt();
        if(age>60){
            System.out.println("You have to retire");
        }
        else if (age>35) {
            System.out.println("You are Man of family");
        }
        else if (age>18) {
            System.out.println("You are an Adult");
        }
        else
            System.out.println("You are a kid");
    }
}
