import Garage.Vehicles.Car;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(4, 4, true);
        Car car2 = new Car(3, 2, false);
        System.out.println(car1);
        System.out.println(car2);
    }
}
