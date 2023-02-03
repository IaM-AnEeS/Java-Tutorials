package com.company;
public class CWH_ch6_26_Array {
    public static void main(String[] args) {
//        There are three ways to create array
//        1- int[] marks=new int[5];
//        2- int [] marks;
//        marks=new int[5]
//        int[]={40,70,90,80,30,40,20,10} Declaration creation initialization
        int[] marks;
        marks = new int[5];
        marks[0]=100;
        marks[1]=90;
        marks[2]=80;
        marks[3]=50;
//        marks[5]=70; Throw Exception error
        System.out.println(marks[4]);
    }
}