import Garage.Vehicles.*;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(4, 4, true);
        Car car2 = new Car(3, 2, false);
        Motorbike bike1 = new Motorbike(2, 6, "small");
        Bus bus1 = new Bus(8, 60, 1);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(bike1);
        System.out.println(bus1);

        Garage myGarage = new Garage();
        myGarage.addVehicle(car1);
        myGarage.addVehicle(car2);
        myGarage.addVehicle(bike1);
        myGarage.addVehicle(bus1);

        myGarage.calculateBill();
    }
}
