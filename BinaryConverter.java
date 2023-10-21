package converter;

import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Decimal, Operator, testNo;
        testNo = 0;
        System.out.println("\n      -- Binary and Decimal Converter -- \n");

        while (true) {

            // Decimal to Binary
            System.out.println("Test No: " + ++testNo);
            System.out.println("Decimal to Binary.");
            System.out.print("Enter Decimal Number: ");
            Decimal = input.nextInt();
            System.out.print("Binary Equivalent Of " + Decimal + " = ");
            System.out.println(Integer.toBinaryString(Decimal));
            System.out.println();

            // Binary to Decimal
            System.out.println("Binary to Decimal.");
            System.out.print("Enter Binary: ");
            String Binary = input.next();
            System.out.print("Decimal Equivalent Of " + Binary + " = ");
            System.out.println(Integer.parseInt(Binary, 2));
            System.out.println("----------------------------------------------");

            // Another Test
            System.out.println("Select Operator");
            System.out.println("1: Another Test");
            System.out.println("2: Exit");
            System.out.print("Input Here: ");
            Operator = input.nextInt();
            System.out.println("----------------------------------------------");

            if (Operator == 1) {
                continue;
            } else if (Operator == 2) {
                System.out.println("THANK YOU FOR USING!");
                System.exit(0);
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
