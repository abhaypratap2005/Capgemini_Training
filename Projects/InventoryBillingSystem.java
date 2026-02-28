package Projects;

import java.util.Scanner;

public class InventoryBillingSystem {

    String name;
    double price;
    double gst;
    int stock;
    int quantity;

    void setProduct(String n, double p, double g) {
        name = n;
        price = p;
        gst = g;
    }

    void addStock(int s) {
        stock += s;
        System.out.println("Stock added. Current stock: " + stock);
    }

    double priceWithGST() {
        return price + (price * gst / 100);
    }

    double totalBill() {
        return priceWithGST() * quantity;
    }

    void clearStock(int qty) {
        if (qty > stock) {
            System.out.println("Not enough stock");
            return;
        }
        quantity = qty;
        stock -= qty;

        System.out.println("\n--- BILL SUMMARY ---");
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: ₹" + totalBill());
        System.out.println("Remaining Stock: " + stock);
    }

    public static void main(String[] args) {

        InventoryBillingSystem shop = new InventoryBillingSystem();
        Scanner sc = new Scanner(System.in);

        System.out.print("Product Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("GST: ");
        double gst = sc.nextDouble();

        shop.setProduct(name, price, gst);

        while (true) {
            System.out.println("\nEnter 1 to ADD stock, 0 to BILL, -1 to EXIT");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.print("Enter stock to add: ");
                int s = sc.nextInt();
                shop.addStock(s);

            } else if (n == 0) {
                System.out.print("Enter quantity to bill: ");
                int qty = sc.nextInt();
                shop.clearStock(qty);

            } else if (n == -1) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
