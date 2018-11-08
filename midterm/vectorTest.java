package problem1.bin;
import java.util.*;

class vector{
  //attribute
  private Integer[] vector;
  //behavior
  vector(int n){
    vector=new Integer[n];
  }
  Integer getElement(int i){
    return vector[i];
  }
  void getId(Integer[] in){
    System.arraycopy(in,0,vector,0,vector.length);
  }
  void info(){
    for(int i=0;i<vector.length;i++){
      System.out.print(" "+vector[i]);
    }
  }
  int length(){
    return vector.length;
  }
}

class Euclidean{
  static double distance(vector obj1,vector obj2){
    double sum=0.0;
    for(int i=0;i<obj1.length();i++){
      sum+=Math.pow((obj1.getElement(i)-obj2.getElement(i)),2);
    }
    return Math.sqrt(sum);
  }
}

public class vectorTest{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("dimension of vector: ");
    int dimension=sc.nextInt();
    vector obj1=new vector(dimension);
    vector obj2=new vector(dimension);
    Integer[] in=new Integer[dimension];
    System.out.println("there are 2 vector A and B: ");
    System.out.println("input value of them:");
    System.out.println("vector A: ");
    for(int i=0;i<obj1.length();i++){
      System.out.print("A["+(i+1)+"]= ");
      in[i]=sc.nextInt();
    }
    obj1.getId(in);
    System.out.println("vector B: ");
    for(int i=0;i<obj1.length();i++){
      System.out.print("B["+(i+1)+"]= ");
      in[i]=sc.nextInt();
    }
    obj2.getId(in);
    System.out.println("info of 2 vector: ");
    System.out.print("vector A: "); obj1.info(); System.out.println(" ");
    System.out.print("vector B: "); obj2.info(); System.out.println(" ");
    System.out.printf("distance: %.4f\n",Euclidean.distance(obj1,obj2));
  }
}
