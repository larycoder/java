package ict8.lab3.ex4;

class shoppingCart{
  //attribute
  private String[] cartContent;
  private int Max=16;
  private int size=0;
  //behaviour
  shoppingCart(){
    cartContent=new String[Max];
  }

  void addCart(String id){
    if(size==Max){
      Max*=2;
      String[] temp=new String[Max];
      System.arraycopy(cartContent,0,temp,0,cartContent.length);
      cartContent=temp;
    }
    cartContent[size]=id;
    size++;
  }

  String checkOut(String id){

  }
  String removeCart(String id){
    if(checkOut(id)=="No_id"){
      System.out.println("There is not exit this id");
    }
    else{
      
    }
  }
}
