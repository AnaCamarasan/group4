package Array.Strings;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Mini", "BMW", 2019);
        Car car2 = new Car("Mini", "BMW", 2020);
        Car car3 = new Car("Golf", "Volkswagen", 2019);
        Car car4 = new Car("A2", "Audi", 2015);
        Car car5 = new Car("Yaris", "Toyota", 2024);
        Car[] carList = {car1, car2, car3, car4, car5};

        // Regular for
        for (int i = 0; i < carList.length; i++){
            System.out.println(carList[i]);
        }
        // Enchanced for
        for (Car car : carList) {
            System.out.println(car);
        }

    }

}
