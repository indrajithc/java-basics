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

      System.out.print("\n\n\n===============================\n\n");

      CarTruck carTruck = new CarTruck("BRAT", 2019, 45333, 10, true);

      System.out.println(" Car2 price " + carTruck.getPrice());

      System.out.print("\n=========================\n");
    carTruck.display();
    car1.display();
  }
}