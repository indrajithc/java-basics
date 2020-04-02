package course.src.subpackageone;

public class CarMain {
  public static void main(String[] args) {
      Car car0 = new Car( "NISSAN", 2019, 45443545, 40);
      Car car1 = new Car();
    
      car1.type = "BMW";
      car1.model = 80;
      car1.price = 3499999;
      car1.milesDrive = 30;
    
      System.out.println(" Car price " + car1.getPrice());
      System.out.println(" Car2 price " + car0.getPrice());

  }
}