package problem2.bin;

class car{
  //attribute
  private double startMiles;
  private double endMiles;
  private double gallons;
  //constructor
  car(double startMiles,double endMiles,double gallons){
    this.startMiles=startMiles;
    this.endMiles=endMiles;
    this.gallons=gallons;
  }
  car(){
    this((Math.random()*100),(100+(Math.random()*100)),(Math.random()*100));
  }
  //behavior
  double calculateMilesPerGallon(){
    return (endMiles-startMiles)/gallons;
  }
  void info(){
    System.out.println("Info of mesure: ");
    System.out.println("startMiles= "+startMiles);
    System.out.println("endMiles= "+endMiles);
    System.out.println("gallons= "+gallons);
  }
}

public class cartTest{
  public static void main(String[] blablabla){
    car obj=new car();
    obj.info();
    System.out.println("Miles_per_gallon is: "+obj.calculateMilesPerGallon());
  }
}
