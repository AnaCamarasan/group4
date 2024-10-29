package inventory.management;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    ArrayList<Product> productInventory;

    public Inventory() {
        this.productInventory = new ArrayList<>();
    }

    public void addProduct () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the next details one by one:");
        System.out.println("Product name:");
        String productName = scanner.nextLine();
        System.out.println("Product price:");
        double productPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Product description:");
        String productDescription = scanner.nextLine();
        System.out.println("Quantity in stock:");
        int quantity = scanner.nextInt();

        Product product1 = new Product(productName, productPrice, productDescription, quantity);
        productInventory.add(product1);

        System.out.println("Product successfully added");
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "productInventory=" + productInventory +
                '}';
    }
}
