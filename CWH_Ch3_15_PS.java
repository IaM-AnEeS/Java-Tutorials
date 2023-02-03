package com.company;
public class CWH_Ch3_15_PS {
    public static void main(String[] args) {
//        Problem1
        String name="Jack Parker";
        name=name.toLowerCase();
        System.out.println(name);

//        Problem2
        String text="My name is Anees Ahmad";
        text=text.replace(" ","_");
        System.out.println(text);

//        Problem3
        String letter="Dear <|name|> thanks a lot";
        letter=letter.replace("<|name|>","Anees");
        System.out.println(letter);
//        Problem 4
        String myString="This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
//        Problem5
    String letter2="Dear Harry,\n\tThis java course is Nice.\nThanks!";
        System.out.println(letter2);

    }

}
