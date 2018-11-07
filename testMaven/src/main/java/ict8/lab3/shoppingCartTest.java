package ict8.lab3.ex4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cart{
  //attribute
  private String name;
  private int id;
  //behavior
  Cart(String name,int id){
    this.name=name;
    this.id=id;
  }
  String getName(){
    return name;
  }
  int getId(){
    return id;
  }
  void info(){
    System.out.println("Cart name: "+name);
    System.out.println("Cart id: "+id);
  }
}

class shoppingCart{
  //attribute
  private List<Cart>cartContent;
  private int size=0;
  //behavior
  shoppingCart(){
    cartContent=new ArrayList<Cart>();
  }
  void addCart(String name,int id){
    Cart obj=new Cart(name,id);
    cartContent.add(size,obj);
    size++;
  }
  void removeCart(String name,int id){
    for(int i=0;i<size;i++){
      if((name.equals(cartContent.get(i).getName()))&&(id==cartContent.get(i).getId())){
        cartContent.remove(i);
        size--;
        System.out.println("Cart is removed successfully");
        return;
      }
    }
    System.out.println("Cart cannot be removed !");
  }
  void checkOut(){
    System.out.println("INFORMATION OF CART CONTENT ARE: ");
    for(int i=0;i<size;i++){
      cartContent.get(i).info();
    }
    System.out.println("\n");
  }
}

public class shoppingCartTest{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    shoppingCart obj=new shoppingCart();
    boolean check=true;
    while(check){
      System.out.println("your option: \n1.addCart\n2.removeCart\n3.checkOut\n4.finishing program\noption");
      int op=sc.nextInt();
      switch(op){
        case 1:
          System.out.println("Name cart: ");
          String name=sc.next();
          System.out.println("Name id: ");
          int id=sc.nextInt();
          obj.addCart(name,id);
          break;
        case 2:
          System.out.println("Name cart: ");
          name=sc.next();
          System.out.println("Name id: ");
          id=sc.nextInt();
          obj.removeCart(name,id);
          break;
        case 3:
          obj.checkOut();
          break;
        case 4:
          check=false;
          break;
        default:
          System.out.println("error option!");
          break;
      }
    }
  }
}