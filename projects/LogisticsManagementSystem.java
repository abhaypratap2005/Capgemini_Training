package projects;
import java.util.*;

public class LogisticsManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Logistics Services");

        ArrayList<String> products = new ArrayList<>();
        products.add("Soap");
        products.add("Shampoo");
        products.add("Cooking Oil");

        ArrayList<String> orders = new ArrayList<>();

        boolean delivered = false;
        String address = "";

        while (true) {

            System.out.println("\nChoose one option from the following" +
                    "\n1 - Place an order" +
                    "\n2 - Check Delivery Status" +
                    "\n3 - Check Your Order" +
                    "\n4 - Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.println("Available products: " + products);
                    System.out.println("Select the product:");
                    String product = sc.nextLine();

                    if (products.contains(product)) {
                        orders.add(product);
                        System.out.println("Order placed successfully");
                        delivered = false;
                    } else {
                        System.out.println("Product not available");
                        break;
                    }

                    System.out.println("Enter delivery address:");
                    address = sc.nextLine();
                    break;

                case 2:
                    if (orders.isEmpty()) {
                        System.out.println("No orders placed yet");
                    } else if (!delivered) {
                        System.out.println("Order is on the way");
                        delivered = true; // simulate delivery
                    } else {
                        System.out.println("Order delivered");
                    }
                    break;

                case 3:
                    if (orders.isEmpty()) {
                        System.out.println("No orders to show");
                    } else {
                        System.out.println("Your order summary:");
                        System.out.println("Items: " + orders);
                        System.out.println("Address: " + address);
                        System.out.println("Status: " + (delivered ? "Delivered" : "On the way"));
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Logistics Services");
                    System.exit(0);

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
