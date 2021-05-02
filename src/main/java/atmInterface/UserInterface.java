package atmInterface;

import atmMachine.Account;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    private static final Account account = new Account();
    public static boolean exit(boolean testing, boolean execute) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            String decision;
            System.out.println("Exit? (Y/N)");

            if (testing) {
                if (execute) {
                    decision = "Y";
                } else {
                    decision = "N";
                }
            } else {
                decision = scan.nextLine();
            }
            if (decision.equalsIgnoreCase("N")) {
                System.out.println("\f");
                menu();
                return false;

            } else if (decision.equalsIgnoreCase("Y")) {

                if (testing) {
                    System.out.println("Shutting down now");
                    System.out.println("This is a test!");
                } else {
                    System.exit(1);
                }
                return true;
            }
        }
    }

    public static void menu() {

        while (true) {
            System.out.println("======================");
            System.out.println("      Please select an options       ");
            System.out.println("======================");
            System.out.println("0. Exit");
            System.out.println("1. Withdraw");
            System.out.println("2. Account balance");

            int choice = readInteger();

            switch (choice) {
                case 0:
                    exit(false, false);
                    break;
                case 1:
                    account.withdraw();
                    break;
                case 2:
                    account.balance();
                    break;
                default:
                    System.out.println("Wrong input! Please choose a number between 0 and 2.");
            }
        }
    }

    public static int readInteger() {

        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        int tal = 0;

        while (loop) {

            try {
                System.out.println("\nChoose from menu:");
                tal = scan.nextInt();
                loop = false;

            } catch (InputMismatchException e) {
                System.out.println("Wrong input!Please choose a number between 0 and 2.");
                //throw new InputMismatchException("Wrong input!Please choose a number between 0 and 2.");
            }
            scan.nextLine();
        }
        return tal;
    }
}
