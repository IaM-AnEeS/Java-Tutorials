package com.company;
import java.util.Scanner;
public class CWH_Ch4_19_Practice_Set {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//     question1
        System.out.println("Enter the value of A: ");
        int a = input.nextInt();
        if (a == 11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");

//        Question 2

        System.out.println("Enter your Marks in physics");
        int physics = input.nextInt();
        System.out.println("Enter your Marks in Biology");
        int Biology = input.nextInt();
        System.out.println("Enter your Marks in Math");
        int Math = input.nextInt();
        float avg = (physics + Math + Biology) / 3f;

        if (avg >= 40 && Math > 33 && physics > 33 && Biology > 33)
            System.out.println("Congrats you have been  Promoted");
        else
            System.out.println("Sorry you fail better uck next time");
//       Question 3

        float tax = 0;
        float income = 3.3f;
        if (tax < 2.5 && tax < 5f)
            tax = tax + 0;
        else if (tax < 2.5 && tax < 5f)
            tax = tax + 0.05f * (income - 2.5f);


//            Question No 4
        System.out.println("Enter the day ");
        int day = input.nextInt();
        switch (day) {
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
                System.out.println("Summer vocation");
//        Question no 5
                System.out.println("Enter the year: ");
                int year = input.nextInt();

                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    System.out.println(year + " is leap year");
                else
                    System.out.println("Not a leap year");
//        Question No 6
                System.out.println("Enter the name of the website:");
                String website = input.next();

                if (website.endsWith(".com"))
                    System.out.println("This is a comercial website");
                else if (website.endsWith(".org"))
                    System.out.println("This is an Organization website");
                else
                    System.out.println("This is an indian website");

        }
    }
}


