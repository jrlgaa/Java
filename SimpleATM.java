import java.util.Scanner;

public class SimpleATM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 1000;

        while (true) {

            System.out.println();

            System.out.print("***Automated Teller Machine***\n");
            System.out.println("1: Withdraw");
            System.out.println("2: Deposit");
            System.out.println("3: Balance");
            System.out.println("4: Exit");
            System.out.print("Choose Operator: ");
            int Operator = input.nextInt();

            switch (Operator) {
                case 1:
                    System.out.print("Enter amount: ");
                    double withdraw = input.nextDouble();

                    if (balance >= withdraw) {

                        balance(balance, withdraw);

                        System.out.println("Please Collect Money");

                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double deposit = input.nextDouble();

                    balance = balance + deposit;

                    System.out.println("Successfully Deposit");
                    break;
                case 3:
                    System.out.format("Balance: %.2f", balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    public static double balance(double balance, double withdraw) {

        return balance - withdraw;
    }
}
