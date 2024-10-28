package two.constructors;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Mini", "BMW", 2019);
        System.out.println(car1);
        Car car2 = new Car("Golf", "Volkswagen");
        System.out.println(car2);

        ArrayList<Car> printCars = car1.getAllCars();
        System.out.println("ALL RECORDED CARS:");
        for (int x = 0; x < printCars.size(); x++){
            System.out.println(printCars.get(x).toString());
        }
    }

}
