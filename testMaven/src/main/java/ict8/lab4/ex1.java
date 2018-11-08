package ict8.lab4.ex1;
import java.lang.*;
import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: "); int n=sc.nextInt();
        Double[] obj=new Double[n];
        for(int i=0;i<n;i++){
            System.out.print("A["+i+"]= ");
            obj[i]=sc.nextDouble();
        }
        Double min=obj[0];
        Double max=obj[0];
        for(int i=0;i<n;i++){
            if(min>obj[i])
                min=obj[i];
            if(max<obj[i])
                max=obj[i];
        }
        System.out.println("Min="+min+" Max= "+max);
    }
}