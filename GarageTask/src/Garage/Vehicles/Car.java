package Garage.Vehicles;

public class Car extends Vehicle {

    private int numOfDoors;
    private boolean isManual;


    public Car(int noOfWheels, int numOfDoors, boolean isManual) {
        super("car", noOfWheels);
        this.numOfDoors = numOfDoors;
        this.isManual = isManual;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    @Override
    public String toString() {
        return super.toString() + " Car{" +
                "numOfDoors=" + numOfDoors +
                ", isManual=" + isManual +
                '}';
    }
}
