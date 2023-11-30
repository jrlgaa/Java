import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numbers[][] = {
      {15, 17, 18, 16},
      {20, 19, 55, 70},
      {21, 54, 56, 71},
      {80, 70, 32, 14}
    };
    System.out.println("     Array Table:");
    System.out.println("|----|----|----|----|");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print("|");
      for (int j = 0; j < 4; j++) {
        System.out.print(" " + numbers[i][j] + " |");
      }
      System.out.println("\n|----|----|----|----|");
    }

    while (true) {
      System.out.print("\nEnter Cell no.1: ");
      int cell1 = input.nextInt();
      if (cell1 > 16) {
        System.out.println("Please input number from 1-16");
        continue;
      }
      System.out.print("Enter Cell no.2: ");
      int cell2 = input.nextInt();
      if (cell2 > 16) {
        System.out.println("Please input number from 1-16");
        continue;
      }
      System.out.print("Choose an operator (+, -, *, /): ");
      char operator = input.next().charAt(0);

      int num1 = numbers[(cell1 - 1) / 4][(cell1 - 1) % 4];
      int num2 = numbers[(cell2 - 1) / 4][(cell2 - 1) % 4];
      int result = 0;

      switch (operator) {
        case '+':
          result = num1 + num2;

          break;
        case '-':
          result = num1 - num2;
          break;
        case '*':
          result = num1 * num2;
          break;
        case '/':
          if (num2 != 0) {
            result = num1 / num2;
          } else {
            System.out.println("Cannot divide by zero.");
            return;
          }
          break;
        default:
          System.out.println("Invalid operator.");
      }

      System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
      System.out.print("Do you want to exit (Y/N): ");
      char Continue = input.next().charAt(0);

      if (Continue != 'N' && Continue != 'n') {
        System.out.print("Program Exit.");
        return;
      }
    }
  }
}
