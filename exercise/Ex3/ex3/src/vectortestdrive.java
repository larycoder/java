package bin;
public class vectortestdrive{
  public static void main(String[] args){
    vector vec1= new vector();
    vector vec2= new vector();
    vec1.get("vec1",12,3);
    vec2.get("vec2",4,20);
    vec1.info();
    vec2.info();
    vec1.add(vec2);
  }
}
