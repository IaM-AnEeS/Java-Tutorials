package com.company;

class EkClass{
    int a;
    public int getA(){
        return a;
    }
     EkClass(int b) {

        this.a = b;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a Constructor");
    }
}
public class CWH_ch10_47_This_Super {
    public static void main(String[] args) {
    EkClass myObj = new EkClass(65);
    DoClass myObj1= new DoClass(5);
        System.out.println(myObj.getA());
    }
}
