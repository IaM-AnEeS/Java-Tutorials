package com.company;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base Setting X now");
        this.x = x;
    }

   public void PrintMe(){
        System.out.println("I am Constructor");
    }
}
class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in derived");this.y = y;
    }
}
public class CWH_ch10_45_Inheritence {
    public static void main(String[] args) {
//        Creating an object of base class
        Base b=new Base();
        b.setX(12);
        System.out.println(b.getX());

//        Creating an object of derived class
        Derived d=new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}
//Quick Quiz
