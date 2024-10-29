package inventory.management;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerList {

    ArrayList<Customer> customerList;

    public CustomerList() {
        this.customerList = new ArrayList<>();
    }

    public void addCustomer () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the customer's details below:");
        System.out.print("\n\t Customer's Name: ");
        String customerName = scanner.nextLine();
        System.out.print("\tCustomer's Email: ");
        String customerEmail = scanner.nextLine();
        Customer newCustomer = new Customer(customerName, customerEmail);
        customerList.add(newCustomer);
        System.out.println("Customer: '" + customerName + "' successfully added");
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();

    }

    public void deleteCustomer(int givenID) {
        Scanner scanner = new Scanner(System.in);
        boolean deleted = false;
        for (Customer c : customerList){
            if (c.getCustomerID() == givenID) {
                customerList.remove(c);
                System.out.println("SUCCESSFULLY DELETED CUSTOMER.");
                deleted = true;
                break;
            }
        }
        if (!deleted){
            System.out.println("UNABLE TO FIND CUSTOMER TO DELETE.");
        }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
    }

    public void updateCustomer(int givenID) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        for (Customer c : customerList){
            if (c.getCustomerID() == givenID) {
                found = true;
                System.out.println("Customer Name was: '" + c.getCustomerName() + "'");
                System.out.print("Now: ");
                c.setCustomerName(scanner.nextLine());
                System.out.println("Customer Email was: '" + c.getCustomerEmail() + "'");
                System.out.print("Now: ");
                c.setCustomerEmail(scanner.nextLine());
                System.out.println("SUCCESSFULLY UPDATED CUSTOMER.");
                break;
            }
        }
        if (!found){
            System.out.println("UNABLE TO FIND CUSTOMER TO UPDATE.");
        }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "customerList=" + customerList;
    }

    public String getCustomer(int givenID) {
        for (Customer c : customerList){
            if (c.getCustomerID() == givenID) {
                return c.toString();
            }
        }
        return "Customer not found.";
    }

}
