import java.util.*;

class Saving{
    float annual_interest;
    float savings_balance;
}
public class SavingsAccount {

    private static final Scanner sc = new Scanner(System.in);
    private static final Saving cus_data = new Saving();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.println("MENU\n1. Details\n2. Monthly interest rate\n3. Change interest rate\n4. Exit\nChoose your option: ");
            int option = sc.nextInt();

            if (option == 1)
                details();

            else if (option == 2)
                calculate_monthly_interest();

            else if (option == 3)
                modify_interest();

            else if (option == 4)
                break;

            else
                System.out.println("Option entered is out of menu bound");

        }
    }

    static void details()
    {
        System.out.println("Enter your current available balance: ");
        cus_data.savings_balance = sc.nextFloat();

        System.out.println("Enter your interest rate: ");
        cus_data.annual_interest = sc.nextFloat();
    }

    static void calculate_monthly_interest()
    {
        float monthly_rate = cus_data.annual_interest * cus_data.savings_balance / 12;
        System.out.println("Monthly rate: " + monthly_rate);
    }

    static void modify_interest()
    {
        System.out.println("Enter the previous interest rate: ");
        float old_interest = sc.nextFloat();

        if (old_interest == cus_data.annual_interest)
        {
            System.out.println("Enter the new interest rate: ");
            cus_data.annual_interest = sc.nextFloat();
        }

        else
        {
            System.out.println("Incorrect Interest Entered");
        }
    }
}
