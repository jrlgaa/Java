package Project;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("\nEnter first number : ");
            double number1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double number2 = input.nextDouble();

            System.out.print("\nSelect Operator");
            Operator("\n + (Add)");
            Operator("\n - (Subtract)");
            Operator("\n * (Multiply)");
            Operator("\n / (Divide)\n");
            Operator("\nInput here: ");
            char Operator = input.next().charAt(0);

            double result;
            switch (Operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
                default:
                    System.out.println("Invalid input");
                    return;
            }
            System.out.format(
                    "\nResult: %.2f %s %.2f = %.2f%n", number1, Operator, number2, result);
            System.out.print("----------------------------------------\n\n");

            System.out.println("Select Menu");
            System.out.println("1: Continue");
            System.out.println("2: Exit");
            System.out.print("Input here: ");
            int menu = input.nextInt();

            if (menu == 1) {
                continue;
            } else if (menu == 2) {
                System.exit(0);
            } else {
                System.out.println("Invalid input");
                return;
            }
        }
    }

    static void Operator(String word) {
        System.out.print(word);
    }
}
