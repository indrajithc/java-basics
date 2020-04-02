package course.src.subpackageone;

public class Car {
  String Type;
  int Model;
  double Price;
  double MilesDrive;

  double getPrice() {
      double newPrice =  Price - (MilesDrive * 10);
      return newPrice;
  }


}