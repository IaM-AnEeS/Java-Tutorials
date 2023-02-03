package com.company;
public class CWH_ch7_Constructor_42{

    public static void main(String[] args) {
        a ref=new a();
        ref.show();
    }
}
class a{
    int a; String name;
    a(){
        a=15;
        name="Anees Ahmad";
    }
    void show(){
        System.out.println(a+" "+name);
    }
}
