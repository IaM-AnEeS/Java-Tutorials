package com.company;

public class CWH_ch6_28_MultiArray {
    public static void main(String[] args) {
        int [][] flats=new int[5][5];
        flats[0][0]=101; flats[2][0]=111; flats[4][0]=121;
        flats[0][1]=102; flats[2][1]=112; flats[4][1]=122;
        flats[0][2]=103; flats[2][2]=113; flats[4][2]=123;
        flats[0][3]=104; flats[2][3]=114; flats[4][3]=124;
        flats[0][4]=105; flats[2][4]=115; flats[4][4]=125;
        flats[1][0]=106; flats[3][0]=116;
        flats[1][1]=107; flats[3][1]=117;
        flats[1][2]=108; flats[3][2]=118;
        flats[1][3]=109; flats[3][3]=119;
        flats[1][4]=110; flats[3][4]=120;
        System.out.println("The Display 2 dimentional Array");
        for (int i=0;i<flats.length;i++){
            for (int j=0;j< flats.length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
