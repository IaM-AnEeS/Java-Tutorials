package com.company;

public class CWH_ch7_33_Varargs {
    static int sum(int...arr){
//        Available as int []arr
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 5 6 is:"+sum(5,6));
        System.out.println("The sum of 5 6 and 7 is:"+sum(5,6,7));
        System.out.println("The sum of 5 6 7 and 8 is:"+sum(5,6,7,8));
        System.out.println("The sum of 5 6 7 8 and 9 is:"+sum(5,6,7,8,9));
    }
}
