package atmInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    public static boolean exit(boolean testing, boolean execute) {

        boolean exit = false;
        while (!exit) {
            Scanner scan = new Scanner(System.in);
            String decision;
            System.out.println("Exit? (Y/N)");

            if (testing) {
                if (execute) {
                    decision = "Y";
                    exit = true;
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
        return false;
    }

    public static void menu() {

        boolean repeat = false;

        while (!repeat) {
            System.out.println("======================");
            System.out.println("      Main Menu       ");
            System.out.println("======================");
            System.out.println("0. Exit");
            System.out.println("1. Withdraw");
            System.out.println("2. Account balance");

            int choice = readInteger();

            switch (choice) {
                case 0:
                    exit(false, false);
                    break;
//                case 1:
//
//                    break;
//                case 2:
//
//                    break;
                default:
                    System.out.println("Wrong input! Please choose a number between 0 and 2.");
            }
        }
    }

    public static int readInteger() {

        Scanner scan = new Scanner(System.in);
        Boolean loop = true;
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
