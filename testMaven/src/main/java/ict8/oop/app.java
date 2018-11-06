package ict8.oop;
import java.lang.*;
import java.util.Scanner;

public class app {

    static int sum(Integer[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] lehiep) {
        //lab 1:
        System.out.println("lab 1:");
        System.out.println("Hello world");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world");
        }
        String obj1 = lehiep[0];
        String obj2 = lehiep[1];
        String obj3 = lehiep[2];
        //lab2
        System.out.println(obj3);
        System.out.println(obj2);
        System.out.println(obj1);
        //lan3
        String obj4 = lehiep[3];
        int objInt = new Double(Math.random() * Integer.parseInt(obj4)).intValue();
        System.out.printf("%d\n", objInt);
        //lab 4
        for (int i = 9; i > 0; i--) {
            System.out.printf("%d bottles of beer we are going to drink, %d bottles of beer.\n", i, i);
            System.out.printf("Now try to drink one, drink one\n");
        }
        System.out.printf("Oh no, no bottles of beer to drink now.\n");
        //lab5
        Scanner scan = new Scanner(System.in);
        System.out.println("operation: a*x+b=0");
        System.out.print("typing a: ");
        Double a = scan.nextDouble();
        System.out.print("typing b: ");
        Double b = scan.nextDouble();
        if (a == 0 && b == 0)
            System.out.println("there is infinite consistent!");
        else if (a == 0 && b != 0)
            System.out.println("there is no solution");
        else
            System.out.println("solution is " + (-a / b));
        //lab6
        System.out.println("operation: a*x^2+b*x+c=0");
        System.out.print("typing a: ");
        Double x = scan.nextDouble();
        System.out.print("typing b: ");
        Double y = scan.nextDouble();
        System.out.print("typing c: ");
        Double z = scan.nextDouble();
        Double delta = Math.pow(y, 2) - 4 * z * x;
        Double sqdelta = Math.sqrt(delta);
        if (delta < 0)
            System.out.println("there is no solution");
        else if (delta == 0)
            System.out.println("Solution is :" + (-y / (2 * x)));
        else
            System.out.println("Solution are: " + ((sqdelta - y) / (2 * x)) + " " + ((-sqdelta - y) / (2 * x)));
        //lab7
        System.out.print("Typing your year: ");
        int year = scan.nextInt();
        if (((year % 4) == 0 && (year % 100) != 0) || ((year % 400) == 0))
            System.out.println("this is leaf year");
        else
            System.out.println("this is not leaf year");
        //lab8
        System.out.print("Enter number of element: ");
        int n = scan.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("A[%d]= ", i + 1);
            arr[i] = scan.nextInt();
        }
        System.out.println("The average is: "+sum(arr)/n);
    }
}
