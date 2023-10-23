import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.print("\nEnter First Number : ");
            double number1 = input.nextDouble();
            System.out.println("\nSelect Operator");
            Operator(" + (Add)");
            Operator(" - (Subtract)");
            Operator(" * (Multiply)");
            Operator(" / (Divide)");
            System.out.print("Input here: ");
            char Operator = input.next().charAt(0);
            System.out.print("\Enter Second Number: ");
            double number2 = input.nextDouble();
      
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
                      if (number2 == 0) {
                    	System.out.println("Can't divide by zero");
                    	return;
                      }
                    break;
                default:
                    System.out.println("Invalid input");
                    return;
            }
            System.out.format("\nResult: %.2f %s %.2f = %.2f%n", number1, Operator, number2, result);
    }

    static void Operator(String word) {
        System.out.println(word);
    }
}
