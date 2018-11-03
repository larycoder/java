package bin;
public class NameCard{
  String name;
  String phone;
  String email;
  public void getName(String in){
    name=in;
  }
  public void getPhone(String in){
    phone=in;
  }
  public void getEmail(String in){
    email=in;
  }
  public void info(){
    System.out.println("Card info: ");
    System.out.println("Card name: "+name);
    System.out.println("Card phone: "+phone);
    System.out.println("Card email: "+email);
  }
}
