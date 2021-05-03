package atmMachine;

import java.util.Scanner;

public class Account {

    private static float balance = 4000;

    public static void withdraw() {

        Scanner scan = new Scanner(System.in);
        float amount;

        System.out.println("Please enter amount to withdraw: ");
        amount = scan.nextFloat();
        if (amount > balance || amount == 0) {
            System.out.println("You have insufficient funds\n\n");
            anotherTransaction();
        } else {
            balance = balance - amount;
            System.out.println("You have withdrawn " + amount + " and your new balance is " + balance + "\n");
        }
    }

    public static void balance(){

        System.out.println("Your balance is " + balance + "\n");
        anotherTransaction();
    }

    private static void anotherTransaction() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit");
        int anotherTransaction = scan.nextInt();
        if (anotherTransaction == 1) {
            withdraw();
        } else if (anotherTransaction == 2) {
            System.out.println("Thanks for choosing us. Good Bye!");
        } else {
            System.out.println("Invalid choice\n\n");
            anotherTransaction();
        }
    }
}