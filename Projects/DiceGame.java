package Projects;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Game " +
                "Please Enter the number of your choice between 1 and 10");
       int s = sc.nextInt();
       System.out.println("Enter 1 to roll and 0 for the exit");
//       int b = sc.nextInt();

        int i = sc.nextInt();
        while(i!=0) {

            int a = (int) ((Math.random() * 10) + 1) % 6;

            if (s <= a) {
                System.out.println("HURRAH");
            } else {
                System.out.println("Lost, The correct number is " + a);
            }
            break;
        }
    }
}
