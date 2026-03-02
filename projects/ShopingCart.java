package projects;
import java.util.*;
import java.util.ArrayList;

public class ShopingCart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> cart = new ArrayList<>();
        while (true) {
            System.out.println("Welcome to the Cart" +
                    "\n Choose any of the following" +
                    "\n 1-Add the details" +
                    "\n 2-See the details" +
                    "\n 3-Remove the details" +
                    "\n4-Check the size" +
                    "\n5-Exit");


            int n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    System.out.println("Enter the details for adding");
                    String c = sc.nextLine();

                    String b = sc.nextLine();
                    users.add(c);
                    cart.add(b);
                    break;

                case 2:
                    System.out.println("Enter the index to see the details");
                    int i = sc.nextInt();
                    System.out.println(users.get(i) + " " + cart.get(i));
                    break;

                case 3:

                    System.out.println("Enter the index to remove");
                    int a = sc.nextInt();

                    cart.remove(a);
                    users.remove(a);
                    break;
                case 4:
                    System.out.println(cart.size());
                    break;
                case 5:
                    System.out.println("Thank you for visiting");
                    return;
            }
        }
    }
}