import Garage.Vehicles.Car;
import Garage.Vehicles.Motorbike;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(4, 4, true);
        Car car2 = new Car(3, 2, false);
        Motorbike bike1 = new Motorbike(2, 6, "small");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(bike1);
    }
}
