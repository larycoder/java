package bin;
public class vector{
  private String name;
  private int x;
  private int y;
  public void get(String inname,int inx,int iny){
    x=inx;
    y=iny;
    name=inname;
  }
  public int setX(){
    return x;
  }
  public int setY(){
    return y;
  }
  public void info(){
    System.out.println("info of vector "+name+": "+x+" "+y);
  }
  public void add(vector e){
    int i= x + e.setX();
    int j= y + e.setY();
    System.out.println("vec1+vec2=("+i+","+j+")");
  }
}
