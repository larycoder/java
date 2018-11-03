package bin;
public class NewCardTestDrive{
  public static void main(String[] args){
    NameCard person1= new NameCard();
    person1.getName(args[0]);
    person1.getPhone(args[1]);
    person1.getEmail(args[2]);
    person1.info();
  }
}
