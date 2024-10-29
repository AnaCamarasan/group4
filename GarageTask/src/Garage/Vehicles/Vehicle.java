package Garage.Vehicles;

public class Vehicle {

    private static int nextVehicleID = 0;
    private final int vehicleID;
    private String vehicleType;
    private int noOfWheels;
    private boolean isBroken;

    public Vehicle(String vehicleType, int noOfWheels, boolean isBroken) {
        this.vehicleID = nextVehicleID++;
        this.vehicleType = vehicleType;
        this.noOfWheels = noOfWheels;
        this.isBroken = isBroken;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleID=" + vehicleID +
                ", vehicleType='" + vehicleType + '\'' +
                ", isBroken='" + isBroken + '\'' +
                ", noOfWheels=" + noOfWheels +
                '}';
    }
}
