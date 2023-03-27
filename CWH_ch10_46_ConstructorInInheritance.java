package com.company;

class Base1{
    Base1(){
        System.out.println("I am a  Constructor ");
    }
    Base1(int x){
        System.out.println("I am an overloaded Constructor of Base Class with value of a as: "+x);
    }
}
class Derived1 extends Base1 {
    Derived1() {
//        super(12);
        System.out.println("I am a Constructor of a derived Class");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded Constructor of derived with value of y as: "+y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a Child of derived class Constructor");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a Child of derives Constructor with value of z as:"+z);
    }
}
public class CWH_ch10_46_ConstructorInInheritance {
    public static void main(String[] args) {
//        Base1 b=new Base1();
//        Derived1 d=new Derived1(4,5);//First Base Class Constructor run
        ChildOfDerived cd=new ChildOfDerived(16,14,15);
    }
}
