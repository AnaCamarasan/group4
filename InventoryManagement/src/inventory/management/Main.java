package inventory.management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Inventory inventory = new Inventory();
    public static CustomerList customerList = new CustomerList();
    public static OrderList orderList = new OrderList();

    public static void main(String[] args) {
        System.out.println("Welcome to the Inventory Management System!");
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\tMAIN MENU:");
        System.out.println("Would you like to view: \n\tOrders (O) \n\tCustomers (C) \n\tProducts (P) \n\tQuit (Q)");
        String userInput = scanner.nextLine();
        switch (userInput.toLowerCase().trim()){
            case "o":
                ordersMenu();
                break;
            case "c":
                customersMenu();
                break;
            case "p":
                productsMenu();
                break;
            case "q":
                System.out.println("Thank you for using the system, see you again soon.");
                scanner.close();
                break;
            default:
                System.out.println("INVALID INPUT. PLEASE INPUT A VALID OPTION.");
                mainMenu();
                break;
        }
    }

    public static void ordersMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\tORDER MENU:");
        System.out.println("Would you like to: \n\tADD an order (A) \n\tFIND an order (F) " +
                "\n\tUPDATE an order (U) \n\tDELETE an order (D) \n\tRETURN to the main menu (R)");
        String userInput = scanner.nextLine();
        String givenOption;

        ArrayList<Integer> productIds = inventory.getProductIds();
        ArrayList<Integer> customerIds = customerList.getCustomerIds();

        switch (userInput.toLowerCase().trim()){
            case "a": // CREATE
                orderList.addOrder(productIds, customerIds);

                ordersMenu();
                break;

            case "f": // READ
                System.out.println("View ALL orders (A) or Individual (type in their ID):");
                givenOption = scanner.nextLine();
                if (givenOption.equalsIgnoreCase("a")) {
                    System.out.println(orderList);
                } else {
                    try {
                        System.out.println(orderList.getOrder(Integer.parseInt(givenOption)));
                    } catch (NumberFormatException e) {
                        System.out.println("INVALID ORDER ID");
                    }
                }
                System.out.println("PRESS ENTER TO CONTINUE");
                scanner.nextLine();
                ordersMenu();
                break;

            case "u": // UPDATE
                System.out.print("Input the order's ID that you want to UPDATE: ");
                givenOption = scanner.nextLine();
                try {
                    orderList.updateOrder(Integer.parseInt(givenOption), productIds, customerIds);
                } catch (NumberFormatException e) {
                    System.out.println("INVALID ORDER ID");
                }
                ordersMenu();
                break;

            case "d": // DELETE
                System.out.print("Input the order's ID that you want to DELETE: ");
                givenOption = scanner.nextLine();
                try {
                    orderList.deleteOrder(Integer.parseInt(givenOption));
                } catch (NumberFormatException e) {
                    System.out.println("INVALID ORDER ID");
                }
                ordersMenu();
                break;

            case "r":
                mainMenu();
                break;

            default:
                System.out.println("INVALID INPUT. PLEASE INPUT A VALID OPTION.");
                ordersMenu();
                break;
        }
    }

    public static void customersMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\tCUSTOMER MENU:");
        System.out.println("Would you like to: \n\tADD a customer (A) \n\tFIND a customer (F) " +
                "\n\tUPDATE a customer (U) \n\tDELETE a customer (D) \n\tRETURN to the main menu (R)");
        String userInput = scanner.nextLine();
        String givenOption;
        switch (userInput.toLowerCase().trim()){

            case "a": // CREATE
                customerList.addCustomer();
                customersMenu();
                break;

            case "f": // READ
                System.out.println("View ALL customers (A) or Individual (type in their ID):");
                givenOption = scanner.nextLine();
                if (givenOption.equalsIgnoreCase("a")) {
                    System.out.println(customerList);
                } else {
                    try {
                        System.out.println(customerList.getCustomer(Integer.parseInt(givenOption)));
                    } catch (NumberFormatException e) {
                        System.out.println("INVALID CUSTOMER ID");
                    }
                }
                System.out.println("PRESS ENTER TO CONTINUE");
                scanner.nextLine();
                customersMenu();
                break;

            case "u": // UPDATE
                System.out.print("Input the customer's ID that you want to UPDATE: ");
                givenOption = scanner.nextLine();
                try {
                    customerList.updateCustomer(Integer.parseInt(givenOption));
                } catch (NumberFormatException e) {
                    System.out.println("INVALID CUSTOMER ID");
                }
                customersMenu();
                break;

            case "d": // DELETE
                System.out.print("Input the customer's ID that you want to DELETE: ");
                givenOption = scanner.nextLine();
                try {
                    customerList.deleteCustomer(Integer.parseInt(givenOption));
                } catch (NumberFormatException e) {
                    System.out.println("INVALID CUSTOMER ID");
                }
                customersMenu();
                break;

            case "r":
                mainMenu();
                break;

            default:
                System.out.println("INVALID INPUT. PLEASE INPUT A VALID OPTION.");
                customersMenu();
                break;
        }
    }

    public static void productsMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\tPRODUCT MENU:");
        System.out.println("Would you like to: \n\tADD a product (A) \n\tFIND a product (F) " +
                "\n\tUPDATE a product (U) \n\tDELETE a product (D) \n\tRETURN to the main menu (R)");
        String userInput = scanner.nextLine();
        String givenOption;
        switch (userInput.toLowerCase().trim()){

            case "a": // CREATE
                inventory.addProduct();
                productsMenu();
                break;

            case "f": // READ
                System.out.println("View ALL products (A) or Individual (type in their ID):");
                givenOption = scanner.nextLine();
                if (givenOption.equalsIgnoreCase("a")) {
                    System.out.println(inventory);
                } else {
                    try {
                        System.out.println(inventory.getProduct(Integer.parseInt(givenOption)));
                    } catch (NumberFormatException e) {
                        System.out.println("INVALID PRODUCT ID");
                    }
                }
                System.out.println("PRESS ENTER TO CONTINUE");
                scanner.nextLine();
                productsMenu();
                break;

            case "u": // UPDATE
                System.out.print("Input the product's ID that you want to UPDATE: ");
                givenOption = scanner.nextLine();
                try {
                    inventory.updateProduct(Integer.parseInt(givenOption));
                } catch (NumberFormatException e) {
                    System.out.println("INVALID CUSTOMER ID");
                }
                productsMenu();
                break;

            case "d": // DELETE
                System.out.print("Input the product's ID that you want to DELETE: ");
                givenOption = scanner.nextLine();
                try {
                    inventory.deleteProduct(Integer.parseInt(givenOption));
                } catch (NumberFormatException e) {
                    System.out.println("INVALID PRODUCT ID");
                }
                productsMenu();
                break;

            case "r":
                mainMenu();
                break;

            default:
                System.out.println("INVALID INPUT. PLEASE INPUT A VALID OPTION.");
                productsMenu();
                break;
        }
    }

}
