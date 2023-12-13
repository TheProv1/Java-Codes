import java.util.Scanner;

class Data_Credit_Card {
    String name;
    String card_no;
    String expiry_month;
    int pin, card_type, credit_limit;
    int current_credit;
    boolean status;
}

public class CreditCard {
    private static Data_Credit_Card cardData = new Data_Credit_Card();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print("\nMenu\n1. Registration\n2. Change Pin\n3. Transact\n4. Manage Card Status\n5. Display Card Details\nEnter your choice: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    registration();
                    break;
                case 2:
                    changePin();
                    break;
                case 3:
                    transact();
                    break;
                case 4:
                    changeCardStatus();
                    break;
                case 5:
                    displayDetails();
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
        sc.close();
    }

    private static void registration() {
        sc.nextLine(); // Consume newline
        System.out.print("\nEnter the name of the Card Holder: ");
        cardData.name = sc.nextLine();

        System.out.print("Enter the Card Number: ");
        cardData.card_no = sc.nextLine();

        System.out.print("Enter the Card Expiry Month: ");
        cardData.expiry_month = sc.nextLine();

        System.out.print("Enter the Card Pin: ");
        cardData.pin = sc.nextInt();

        System.out.print("Enter the Card type: ");
        cardData.card_type = sc.nextInt();

        System.out.print("Enter the Credit Limit of the Card: ");
        cardData.credit_limit = sc.nextInt();

        System.out.print("Enter the current credit limit of the Card: ");
        cardData.current_credit = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Is the Card enabled(y/n): ");
        String active = sc.nextLine();

        cardData.status = active.equalsIgnoreCase("y");

        transact(); // Perform initial transaction
        displayDetails();
        changeCardStatus();
    }

    private static void changePin() {
        System.out.print("Enter your Old PIN: ");
        int oldPin = sc.nextInt();

        if (oldPin == cardData.pin) {
            System.out.print("Enter the new PIN: ");
            cardData.pin = sc.nextInt();
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Incorrect old PIN. PIN change failed.");
        }
    }

    private static void transact() {
        if (cardData.status) {
            System.out.print("Enter the amount to be transacted: ");
            int amount = sc.nextInt();

            if (amount >= cardData.current_credit) {
                System.out.println("The amount entered is greater than or equal to the available balance.");
            } else if (amount > cardData.credit_limit) {
                System.out.println("The amount to be transferred is greater than the Credit Limit. Contact your branch for modifying it.");
            } else {
                System.out.println("Transacting Amount");
                cardData.current_credit -= amount;
                System.out.println("Updated available balance: " + cardData.current_credit);
            }
        } else {
            System.out.println("Your card is disabled/inactive");
        }
    }

    private static void changeCardStatus() {
        cardData.status = !cardData.status;
        System.out.println("Card status changed to " + (cardData.status ? "Enabled/Active" : "Disabled/Inactive"));
    }

    private static void displayDetails() {
        System.out.println("\nName of Account Holder: " + cardData.name);
        System.out.println("Card Number: " + cardData.card_no);
        System.out.println("Card Expiry Month: " + cardData.expiry_month);
        System.out.println("Card Limit: " + cardData.credit_limit);
        System.out.println("Card Pin: " + cardData.pin);
        System.out.println("Available Balance: " + cardData.current_credit);
        System.out.println("Card Status: " + (cardData.status ? "Enabled/Active" : "Disabled/Inactive"));
    }
}
