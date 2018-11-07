package ict8.lab3.Ex5;

import java.util.Scanner;

class Button{
    //attribute
    private String label;
    private String color;
    private boolean press;
    //behavior
    void setLabel(String label){
        this.label=label;
    }
    void setColor(String color){
        this.color=color;
    }
    void dePress(){
        press=true;
    }
    void undePress(){
        press=false;
    }
    void info(){
        String out;
        if(press)
            out="press";
        else
            out="unpress";
        System.out.println("This button has: ");
        System.out.println("Label: "+label);
        System.out.println("Color: "+color);
        System.out.println("It is "+out);
    }
}

public class BottonTest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Button obj=new Button();
        System.out.println("push info for button: ");
        System.out.print("label: "); obj.setLabel(sc.next());
        System.out.print("Color: "); obj.setColor(sc.next());
        System.out.print("do you want press button? "); String answer=sc.next();
        if(answer.equals("yes"))
            obj.dePress();
        else
            obj.undePress();
        obj.info();
    }
}