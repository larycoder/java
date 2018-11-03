package bin;
public class cow_test_drive{
  public static void main(String[] args){
    cow mycow = new cow();
    mycow.getName(args[0]);
    mycow.getBreed(args[1]);
    int i=Integer.valueOf(args[2]).intValue();
    mycow.getAge(i);
    mycow.info();
    mycow.moo();
  }
}
