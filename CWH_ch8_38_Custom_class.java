package com.company;

import java.sql.SQLOutput;

class Employee{
    int id;
    String name;
    int Salary;
    String Detail;
    public void printDetails(){
        System.out.println("My id number is :"+id);
        System.out.println("My name is :"+name);
    }
    public void getSalary(){
        System.out.println("My salary is :"+Salary);
    }
    public void getDetails(){
        System.out.println("MyDetail :"+Detail);
    }
}
public class CWH_ch8_38_Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Anees=new Employee();
        Employee Moiz=new Employee();
        Employee Haider=new Employee();
        Anees.name="ANEES AHMAD";
        Anees.id=1060;
        Anees.Salary=20000;
        Anees.Detail="\n    Gym Lover\n    Anime Lover\n    Reading Books\n    Netflix\n    Student of BCS";

        Moiz.name="Abdul Moiz Muhammad";
        Moiz.id=1062;
        Moiz.Salary=22000;
        Moiz.Detail="\n    Gym Lover\n    Anime Lover\n    Reading Books\n    Netflix\n    Student of BAI";

        Haider.name="ALI HAIDER";
        Haider.id=1061;
        Haider.Salary=21000;
        Haider.Detail="\n   Gym Lover\n    Anime Lover\n    Reading Books\n    Netflix\n    Student of BCS";

        Anees.printDetails();
        Anees.getSalary();
        Anees.getDetails();
        Haider.printDetails();
        Haider.getSalary();
        Haider.getDetails();
        Moiz.printDetails();
        Moiz.getSalary();
        Moiz.getDetails();
//        Printing the attributes
//        System.out.println(Anees.id);
//        System.out.println(Anees.name);
    }
}
