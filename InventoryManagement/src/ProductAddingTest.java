import inventory.management.Inventory;

import java.util.Scanner;

public class ProductAddingTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the inventory manager! Do you want to add a product?");
        String userInput = scanner.nextLine();

        while (userInput.equalsIgnoreCase("yes")) {
            inventory.addProduct();

            System.out.println("Would you like to add another product?");
            userInput = scanner.nextLine();
        }

        scanner.close();
        System.out.println(inventory);
        System.out.println("Thank you! See you again soon");
    }
}
