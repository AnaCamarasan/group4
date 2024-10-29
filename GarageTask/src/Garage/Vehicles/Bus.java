package Garage.Vehicles;

public class Bus extends Vehicle {

    private int numOfSeats;
    private int routeNumber;

    public Bus(int noOfWheels, boolean isBroken, int numOfSeats, int routeNumber) {
        super("bus", noOfWheels, isBroken);
        this.numOfSeats = numOfSeats;
        this.routeNumber = routeNumber;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " Bus{" +
                "numOfSeats=" + numOfSeats +
                ", routeNumber=" + routeNumber +
                '}';
    }
}
