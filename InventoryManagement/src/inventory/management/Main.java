package inventory.management;

import java.util.Scanner;

public class Main {

    public static Inventory inventory = new Inventory();
    public static CustomerList customerList = new CustomerList();

    public static void main(String[] args) {
        System.out.println("Welcome to the Inventory Management System!");
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\tMAIN MENU:");
        System.out.println("""
                            Would you like to view:\s
                            \tOrders (O)\s
                            \tCustomers (C)\s
                            \tProducts (P)\s
                            \tQuit (Q)""");
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
        // CREATE
        // READ
        // UPDATE
        // DELETE
    }

    public static void customersMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\tCUSTOMER MENU:");
        System.out.println("""
                Would you like to:\s
                \tADD a customer (A)\s
                \tFIND a customer (F)\s
                \tUPDATE a customer (U)\s
                \tDELETE a customer (D)\s
                \tRETURN to the main menu (R)""");
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
        // CREATE
        // READ
        // UPDATE
        // DELETE
    }

}
