import java.util.Scanner;
import java.util.Random;

public class Loops {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random randomNum = new Random();

    boolean Continue = true;

    while (Continue) {
      int min = 1;
      int max = 100;
      int numOfAttempts = 1;

      int randomNumber = randomNum.nextInt(max - min + 1) + min;

      while (true) {
        System.out.print("Enter your Number: ");
        int userNum = input.nextInt();

        if (userNum < 1 || userNum > 100) {
          System.out.println("Invalid Number, Please enter 1 - 100");
          continue;
        }

        numOfAttempts++;

        if (userNum < randomNumber) {
          System.out.println("Too Low");
        } else if (userNum > randomNumber) {
          System.out.println("Too High");
        } else {
          System.out.println(
              "Congratulations! You guessed the number in " + numOfAttempts + " attempts");

          System.out.print("Do you want to play again? Yes or No?: ");
          input.nextLine();
          String playAgain = input.nextLine();

          if (playAgain.equalsIgnoreCase("Yes")) {
            break;
          } else {
            Continue = false;
            System.out.println("Thank you for playing.");
            break;
          }
        }
      }
    }
  }
}
