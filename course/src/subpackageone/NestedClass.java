package course.src.subpackageone;

public class NestedClass {

    static class Car {
        String type;
        int model;
        double price;
        double milesDrive;
 

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

        void display() {
            System.out.println("Type : " + this.type);
            System.out.println("Model : " + this.model);
            System.out.println("Price : " + this.price);
            System.out.println("miles Drive : " + this.milesDrive);
            System.out.println("new Price : " + this.getPrice());
        }
    }
 

    public static void main(String[] args) {
        
        System.out.println("=========== nested class example =======");
        Car car = new Car( "NISSAN", 2019, 45443545, 40);
        car.display();
    }
}