package com.company;

import java.util.SplittableRandom;

class MyEmployee{
    private  int age;
   private   String name;
   public String getName(){
       return name;
   }
   public void setName(String n){
       name=n;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int i){
       age=i;
   }
}
public class CWH_ch9_40_Modifiers {
   public static void main(String[] args) {
        MyEmployee nesu = new MyEmployee();
//        nesu.age = 19;
//        nesu.name ="Anees Ahmad"; Throws an Erroe due to private Access modifier
       nesu.setName("Anees Ahmad");
       System.out.println(nesu.getName());
       nesu.setAge(20);
       System.out.println(nesu.getAge());
    }

}
