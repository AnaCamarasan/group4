package two.constructors;

import java.util.ArrayList;

public class Car {

    private static final ArrayList<Car> allCars = new ArrayList<>();
    private String model;
    private String brand;
    private int year;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        allCars.add(this);
    }

    public Car(String model, String brand) {
        this(model, brand, 2024);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

    public ArrayList<Car> returnList() {
       return allCars;
    }
}
