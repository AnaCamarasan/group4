package inventory.management;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderList {
    ArrayList<Order> orderList;

    public OrderList() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder (ArrayList<Integer> productIds, ArrayList<Integer> customerIds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the order's details below:");

        int productId = -1, customerId = -1;
        boolean productIdExists = false;
        while (!productIdExists) {
            System.out.print("\n\t Product's ID: ");
            productId = scanner.nextInt();
            if (!productIds.contains(productId)) {
                System.out.println("This product is not in the inventory. Try one of these ones: " + productIds);
            } else {
                productIdExists = true;
            }
        }

        boolean customerIdExists = false;
        while (!customerIdExists) {
            System.out.print("\n\t Customer's ID: ");
            customerId = scanner.nextInt();
            if (!customerIds.contains(customerId)) {
                System.out.println("This customer is not in the customer list. Try one of these ones: " + customerIds);
            } else {
                customerIdExists = true;
            }
        }

        Order order = new Order(productId, customerId);
        orderList.add(order);

        System.out.println("Order successfully added");
    }

    public void deleteOrder(int givenID) {
        Scanner scanner = new Scanner(System.in);
        boolean deleted = false;
        for (Order o : orderList){
            if (o.getOrderId() == givenID) {
                orderList.remove(o);
                System.out.println("SUCCESSFULLY DELETED ORDER.");
                deleted = true;
                break;
            }
        }
        if (!deleted){
            System.out.println("UNABLE TO FIND ORDER TO DELETE.");
        }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
    }

    public void updateOrder(int givenID, ArrayList<Integer> productIds, ArrayList<Integer> customerIds) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        for (Order o : orderList){
            if (o.getOrderId() == givenID) {
                found = true;
                System.out.println("Product ID was: '" + o.getProductId() + "'");
                System.out.print("Product IDs available are: " + productIds + " Pick one:");
                o.setProductId(scanner.nextInt());

                System.out.println("Customer ID was: '" + o.getCustomerId() + "'");
                System.out.print("Customer IDs available are: " + customerIds + " Pick one:");
                o.setCustomerId(scanner.nextInt());

                System.out.println("SUCCESSFULLY UPDATED ORDER.");
                break;
            }
        }
        if (!found){
            System.out.println("UNABLE TO FIND ORDER TO UPDATE.");
        }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
    }

    public String getOrder(int givenID) {
        for (Order o : orderList){
            if (o.getOrderId() == givenID) {
                return o.toString();
            }
        }
        return "Customer not found.";
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "orderList=" + orderList +
                '}';
    }
}
