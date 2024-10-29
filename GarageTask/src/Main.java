import Garage.Vehicles.*;

public class Main {

    public static void main(String[] args) {


        // Testing creating vehicle classes
        Car car1 = new Car(4,true, 4, true);
        Car car2 = new Car(3, true, 2, false);
        Motorbike bike1 = new Motorbike(2, true, 6, "small");
        Bus bus1 = new Bus(8, true, 60, 1);
        Car car3 = new Car(3, true, 2, false);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(bike1);
        System.out.println(bus1);

        // Testing out basic garage functions
        Garage myGarage = new Garage();
        myGarage.addVehicle(car1);
        myGarage.addVehicle(car2);
        myGarage.addVehicle(bike1);
        myGarage.addVehicle(bus1);
        myGarage.addVehicle(car3);
        // Testing calculating max bills
        for (Vehicle v: myGarage.getVehicleList()){
            myGarage.calculateBill(v);
        }

        System.out.println(myGarage);
        myGarage.fixVehicle(1);
        System.out.println(myGarage);
        myGarage.fixVehicle(1);

        // remove by id
        myGarage.removeVehicleByID(3);
        System.out.println(myGarage);
        // remove by type (single)
        myGarage.removeVehicleByType("car");
        System.out.println(myGarage);
        // remove by all type
        myGarage.removeAllVehicleByType("car");
        System.out.println(myGarage);
        // empty garage
        myGarage.emptyGarage();
        System.out.println(myGarage);

    }
}
