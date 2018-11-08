package ict8.lab4;
import java.util.Scanner;
import java.io.*;

public class employeeManage{
    public static void main(String[] args){
        try{
            PrintWriter out=new PrintWriter(new FileWriter("text.txt"));
            out.print("hello world 12");
            out.close();
            Scanner sc=new Scanner(new FileInputStream("text.txt"));
            System.out.println(sc.next());
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
