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

    public String getProduct(int givenID) {
        for (Product p : productInventory){
            if (p.getProductId() == givenID) {
                return p.toString();
            }
        }
        return "Product not found.";
    }

    public void updateProduct(int givenID) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        for (Product p : productInventory){
            if (p.getProductId() == givenID) {
                found = true;
                System.out.println("Product Name was: '" + p.getProductName() + "'");
                System.out.print("Now: ");
                p.setProductName(scanner.nextLine());
                System.out.println("Product Price was: '" + p.getProductPrice() + "'");
                System.out.print("Now: ");
                p.setProductPrice(scanner.nextDouble());
                System.out.println("Product Description was: '" + p.getProductDescription() + "'");
                System.out.print("Now: ");
                p.setProductDescription(scanner.nextLine());
                System.out.println("Product Quantity in Stock was: '" + p.getQuantityInStock() + "'");
                System.out.print("Now: ");
                p.setQuantityInStock(scanner.nextInt());
                System.out.println("SUCCESSFULLY UPDATED PRODUCT.");
                break;
            }
        }
        if (!found){
            System.out.println("UNABLE TO FIND PRODUCT TO UPDATE.");
        }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
    }

    public void deleteProduct(int givenID) {
        Scanner scanner = new Scanner(System.in);
        boolean deleted = false;
        for (Product p : productInventory){
            if (p.getProductId() == givenID) {
                productInventory.remove(p);
                System.out.println("SUCCESSFULLY DELETED PRODUCT.");
                deleted = true;
                break;
            }
        }
        if (!deleted){
            System.out.println("UNABLE TO FIND PRODUCT TO DELETE.");
        }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
    }

    public ArrayList<Integer> getProductIds () {
        ArrayList<Integer> productIds = new ArrayList<>();
        for (Product p : productInventory) {
            productIds.add(p.getProductId());
        }

        return productIds;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "productInventory=" + productInventory +
                '}';
    }
}
