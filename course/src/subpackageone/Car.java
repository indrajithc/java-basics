package course.src.subpackageone;

public class Car {
  String type;
  int model;
  double price;
  double milesDrive;

  Car () {
      
  }

 Car( String type, int model, double price, double milesDrive) {
     this.type = type;
     this.model = model;
     this.price = price;
     this.milesDrive = milesDrive;
 }

  double getPrice() {
      double newPrice =  price - (milesDrive * 10);
      return newPrice;
  }


}