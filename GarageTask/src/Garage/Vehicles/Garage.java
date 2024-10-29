package Garage.Vehicles;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> vehicleList;

    public Garage() {
        this.vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void calculateBill () {
        for (Vehicle v : vehicleList) {
            switch (v.getVehicleType()) {
                case "car":
                    System.out.println(v.getVehicleID() + " has bill " + v.getNoOfWheels() * 10);
                    break;
                case "motorbike":
                    System.out.println(v.getVehicleID() + " has bill " + v.getNoOfWheels() * 5);
                    break;
                case "bus":
                    System.out.println(v.getVehicleID() + " has bill " + v.getNoOfWheels() * 15);
                    break;
            }
        }
    }
}
