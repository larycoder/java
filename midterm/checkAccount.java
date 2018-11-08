package problem3.bin;
import java.util.*;

class Account{
  //attribute
  private String number;
  private String holder;
  private int balance=0;
  //behavior
  Account(String number,String holder){
    this.number=number;
    this.holder=holder;
  }
  void currentBalance(){
    System.out.println("account info: ");
    System.out.println("number: "+number);
    System.out.println("holder: "+holder);
    System.out.println("balance: "+balance);
  }
  void deposite(int amount){
    balance+=amount;
  }
  void withdraw(int amount){
    balance-=amount;
  }
  boolean checkNumber(String number){
    if(this.number.equals(number))
      return true;
    else
      return false;
  }
  boolean checkHolder(String holder){
    if(this.holder.equals(holder))
      return true;
    else
      return false;
  }
}

class Account_content{
  private List<Account>list;
  private int size=0;
  Account_content(){
    list=new ArrayList<Account>();
  }
  void setAccount(String name,String number){
    list.add(size,new Account(number,name));
    size++;
  }
  Account getAccount(String name, String number){
    for(int i=0;i<size;i++){
      if(list.get(i).checkNumber(number)&&list.get(i).checkHolder(name)){
        return list.get(i);
      }
    }
    return null;
  }
}

public class checkAccount{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  boolean continues=true;
  Account_content list=new Account_content();
  while(continues){
    System.out.println("Option: ");
    System.out.println("1.create account\n2.Using account\n3.stop program\nYour option: ");
    int op=sc.nextInt();
    switch(op){
      case 1:
        System.out.print("your name: ");
        String name=sc.next();
        System.out.print("your cmtnd: ");
        String number=sc.next();
        list.setAccount(name,number);
        System.out.println("your account is created successfully");
        break;
      case 2:
        System.out.print("your name: ");
        name=sc.next();
        System.out.print("your cmtnd: ");
        number=sc.next();
        Account obj=list.getAccount(name,number);
        if(obj==null){
          System.out.println("this account is not exit");
          break;
        }
        else{
          obj.currentBalance();
          System.out.println("deposite: "); int in=sc.nextInt();
          System.out.println("withdraw: "); int out=sc.nextInt();
          obj.deposite(in);
          obj.withdraw(out);
          obj.currentBalance();
        }
        break;
      case 3:
        continues=false;
        break;
      default:
        System.out.println("not exit this option!");
        break;
      }
    }
  }
}
