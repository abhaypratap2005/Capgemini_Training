package Projects;

import java.util.Scanner;

public class ATM_Machine {

    int balance = 10000;
    int pin = 1111;

    public int checkBalance() {
        return balance;
    }

    public String withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return "Success";
        }
        return "No balance";
    }

    public void changePin(int newPin) {
        pin = newPin;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public String quickWithdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return "Success";
        }
        return "No balance";
    }

    public static void main(String[] args) {

        ATM_Machine obj = new ATM_Machine(); // FIXED
        Scanner sc = new Scanner(System.in);

        System.out.println("1-check balance  2-withdraw  3-change pin  4-deposit  5-quick withdraw");
        int n = sc.nextInt();

        System.out.print("Enter the pin: ");
        int a = sc.nextInt();

        if (a == obj.pin) {

            if (n == 1) {
                System.out.println(obj.checkBalance());

            } else if (n == 2) {
                System.out.print("Enter amount: ");
                System.out.println(obj.withdraw(sc.nextInt()));

            } else if (n == 3) {
                System.out.print("Enter new pin: ");
                obj.changePin(sc.nextInt());
                System.out.println("Pin changed");

            } else if (n == 4) {
                System.out.print("Enter amount: ");
                obj.deposit(sc.nextInt());
                System.out.println("Deposited");

            } else if (n == 5) {
                System.out.print("Enter amount: ");
                System.out.println(obj.quickWithdraw(sc.nextInt()));
            }

        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}
