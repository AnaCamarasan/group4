package Garage.Vehicles;

public class Motorbike extends Vehicle {

    private int noOfGears;

    private String engineSize;

    public Motorbike(int noOfWheels, boolean isBroken, int noOfGears, String engineSize) {
        super("motorbike", noOfWheels, isBroken);
        this.noOfGears = noOfGears;
        this.engineSize = engineSize;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return super.toString() + " Motorbike{" +
                "noOfGears=" + noOfGears +
                ", engineSize='" + engineSize + '\'' +
                '}';
    }
}
