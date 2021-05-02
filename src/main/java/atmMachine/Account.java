package atmMachine;

import java.util.Scanner;

public class Account {

    private static Scanner in;
    private static float balance = 4000;
    private static int anotherTransaction;

    public static void withdraw() {

        float amount;

        System.out.println("Please enter amount to withdraw: ");
        amount = in.nextFloat();
        if (amount > balance || amount == 0) {
            System.out.println("You have insufficient funds\n\n");
            anotherTransaction(); // ask if they want another transaction
        } else {
            // they have some cash
            // update balance
            balance = balance - amount;
            System.out.println("You have withdrawn " + amount + " and your new balance is " + balance + "\n");
        }
    }

        public static void balance(){
            System.out.println("Your balance is " + balance + "\n");
            anotherTransaction();
        }

    private static void anotherTransaction() {
        System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit");
        anotherTransaction = in .nextInt();
        if (anotherTransaction == 1) {
//            transaction(); // call transaction method
        } else if (anotherTransaction == 2) {
            System.out.println("Thanks for choosing us. Good Bye!");
        } else {
            System.out.println("Invalid choice\n\n");
            anotherTransaction();
        }
    }
}