package com.company;
public class CWH_ch6_27_ForEach {
    public static void main(String[] args) {
     /*   int[] marks={89,52,24,65,67,73};
        System.out.println(marks.length);
        float [] marks={89.1f,52.2f,24.5f,65.9f,67.4f,73.6f};
        System.out.println(marks.length);
        String [] students={"Anees Ahmad","Abdul Moiz","Ali Haider"};
        System.out.println(students.length);
        */
        System.out.println("Printing using loop in reverse order");
        int[] marks={94,24,42,62,62,74,};
        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using loop in reverse order");
         for(int i=marks.length-1; i>=0;i--){
             System.out.println(marks[i]);
         }
        System.out.println("Printing array using for-each loop");
         for (int element: marks){
             System.out.println(element);
         }

    }
}
