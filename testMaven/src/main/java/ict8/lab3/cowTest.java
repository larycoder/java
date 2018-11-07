package ict8.lab3.ex1;

class cow{
  //attribute
  private String name;
  private String breed;
  private int age;
  //behaviour
  cow(String name,String breed,int age){
    this.name=name;
    this.breed=breed;
    this.age=age;
  }
  void moo(){
    System.out.println("Moo...!");
  }
  void setName(String in){
    name=in;
  }
  void setBreed(String in){
    breed=in;
  }
  void setAge(int in){
    age=in;
  }
  void info(){
    System.out.println("cow name: "+name);
    System.out.println("cow breed: "+breed);
    System.out.println("cow age: "+age);
  }
}

public class cowTest{
  public static void main(String[] args){
    cow obj=new cow("Emilie","Fluffy",2);
    obj.info();
    obj.moo();
  }
}
