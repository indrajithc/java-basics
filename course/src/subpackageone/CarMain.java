package course.src.subpackageone;

public class CarMain {
  public static void main(String[] args) {
      Car car1 = new Car();
    
      car1.Type = "BMW";
      car1.Model = 80;
      car1.Price = 3499999;
      car1.MilesDrive = 30;
    
      System.out.println(" Car price " + car1.getPrice());

  }
}