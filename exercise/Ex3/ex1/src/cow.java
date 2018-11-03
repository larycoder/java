package bin;
public class cow{
  String name;
  String breed;
  int age;
  public void getName(String in){
    name=in;
  }
  public void getBreed(String in){
    breed=in;
  }
  public void getAge(int in){
    age=in;
  }
  public void info(){
    System.out.println("cow info:");
    System.out.println("name:     "+name);
    System.out.println("cow info: "+breed);
    System.out.println("cow info: "+age);
  }
  public void moo(){
    System.out.println("Moo...!");
  }
}
