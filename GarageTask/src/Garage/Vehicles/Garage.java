package Garage.Vehicles;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> vehicleList;

    public Garage() {
        this.vehicleList = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void calculateBill (Vehicle v) {
        switch (v.getVehicleType()) {
            case "car":
                System.out.println("Vehicle ID: " + v.getVehicleID() + " has bill: £" + v.getNoOfWheels() * 10);
                break;
            case "motorbike":
                System.out.println("Vehicle ID: " + v.getVehicleID() + " has bill: £" + v.getNoOfWheels() * 5);
                break;
            case "bus":
                System.out.println("Vehicle ID: " + v.getVehicleID() + " has bill: £" + v.getNoOfWheels() * 15);
                break;
        }

    }

    // remove by id
    public void removeVehicleByID(int givenID) {
        for (Vehicle v : vehicleList){
            if (v.getVehicleID() == givenID) {
                vehicleList.remove(v);
                break;
            }
        }
    }

    // remove by type (first occurance)
    public void removeVehicleByType(String givenType){
        for (Vehicle v : vehicleList){
            if (v.getVehicleType().equals(givenType) && !v.isBroken()) {
                vehicleList.remove(v);
                break;
            }
        }
    }

    // remove by type (all occurances)
    public void removeAllVehicleByType(String givenType){
        vehicleList.removeIf(v -> v.getVehicleType().equals(givenType));
    }

    // fix vehicle
    public void fixVehicle(int vehicleID){
        for (Vehicle v : vehicleList) {
            if (v.getVehicleID() == vehicleID) {
                if (v.isBroken()) {
                    v.setBroken(false);
                    System.out.println("Vehicle ID: " + v.getVehicleID() + " has been FIXED.");
                } else {
                    System.out.println("Vehicle ID: " + v.getVehicleID() + " has already been FIXED.");
                }
                calculateBill(v);
                break;
            }
        }
    }
    // empty garage
    public void emptyGarage() {
        vehicleList.clear();
    }

    // List all vehicles in the garage
    @Override
    public String toString() {
        return "Garage{" +
                "vehicleList=" + vehicleList +
                '}';
    }
}
