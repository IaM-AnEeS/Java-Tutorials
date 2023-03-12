package com.company;
class Employee1{
    int Salary;
    String name;
    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}
class CellPhone{
    public void ringing(){
        System.out.println("Ringing....");
    }
    public void calling(){
        System.out.println("Calling....");
    }
    public void vibrating(){
        System.out.println("Vibrating....");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int width;
    int length;
    public int area(){
        return width*length;
    }
    public int perimeter(){
        return 2*(width+length);
    }
}
class Tomy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
class Circle{
    int pie;
    int radius;
    public int area(){
        return pie*radius*radius;
    }
    public int perimeter(){
       return 2*pie*radius;
    }
}
public class CWH_ch8_39_PS {
    public static void main(String[] args) {

//        Problem 1
        Employee1 Nesu=new Employee1();
        Nesu.setName("Anees Ahmad");
        Nesu.Salary=120000;
        System.out.println(Nesu.getName());
        System.out.println(Nesu.getSalary());
//        problem2
        CellPhone iphone=new CellPhone();
        iphone.ringing();
        iphone.calling();
        iphone.vibrating();


//        Problem3
        Square sq=new Square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

//        problem4
        Rectangle rec=new Rectangle();
        rec.width=3;
        rec.length=4;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

//        Problem5
        Tomy Player1=new Tomy();
        Player1.fire();
        Player1.run();
        Player1.hit();
//        Problem6
        Circle ci=new Circle();
        ci.pie=3;
        ci.radius=4;
        System.out.println(ci.area());
        System.out.println(ci.perimeter());

    }
}
