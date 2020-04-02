package course.src.subpackageone;

public class CarTruck extends Car {
    boolean hasTruck;

    CarTruck(  String type, int model, double price, double milesDrive, boolean hasTruck) {
        super( type, model, price, milesDrive);
        this.hasTruck = hasTruck;

    }

  @Override
  void display() {
      super.display();
    System.out.println("Has Truck : " + this.hasTruck);
  }
}