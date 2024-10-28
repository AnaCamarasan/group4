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

        // StringBuilder
        String string1 = "Hello";
        String string2 = "World";
        StringBuilder sb = new StringBuilder();
        sb.append(string1);
        System.out.println(sb);
        sb.insert(5, string2);
        System.out.println(sb);
        sb.replace(5, 6, " W" );
        System.out.println(sb);
        sb.delete(0, 6);
        System.out.println(sb);
        System.out.println(sb.toString());

        // Multi dimensional arrays
        Car[][] carMatrix = {{car1, car2}, {car3, car4}};

        for (int i = 0; i < carMatrix.length; i++) {
            for (int j = 0; j < carMatrix[i].length; j++) {
                System.out.println(carMatrix[i][j]);
            }
            System.out.println();
        }

        for (Car[] matrix : carMatrix) {
            for (Car car : matrix) {
                System.out.println(car);
            }
            System.out.println();
        }
    }

}
