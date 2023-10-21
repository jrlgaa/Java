import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Product names
        System.out.print("1: Product name: ");
        String Products1 = input.nextLine();
        System.out.print("2: Product name: ");
        String Products2 = input.nextLine();
        System.out.print("3: Product name: ");
        String Products3 = input.nextLine();
        System.out.print("4: Product name: ");
        String Products4 = input.nextLine();

        System.out.println();

        // Product price
        System.out.print(Products1 + " Price: ");
        double Price1 = input.nextDouble();
        System.out.print(Products2 + " Price: ");
        double Price2 = input.nextDouble();
        System.out.print(Products3 + " Price: ");
        double Price3 = input.nextDouble();
        System.out.print(Products4 + " Price: ");
        double Price4 = input.nextDouble();

        // vatRate
        double subtotal = subtotal(Price1, Price2, Price3, Price4);
        double taxRate = 12;
        double vatRate = vatRate(subtotal, taxRate);
        double total = total(subtotal, vatRate);
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Vat Rate: 12%% = %.2f%n", vatRate);
        System.out.printf("Total: %.2f%n", total);

        // Payment method
        System.out.print("Enter Cash amount: ");
        double Pay = input.nextDouble();
        double Cash = Cash(Pay, total);
        if (Pay >= total) {
        } else {
            System.out.println("Insufficient Amount");
            return;
        }

        System.out.println();
        System.out.println("RECEIPT");
        System.out.println("****************************************************");
        System.out.println(Products1 + "-----------------" + Price1);
        System.out.println(Products2 + "-----------------" + Price2);
        System.out.println(Products3 + "-----------------" + Price3);
        System.out.println(Products4 + "-----------------" + Price4);
        System.out.println("___________________________________________________");

        System.out.printf("Subtotal                 %.2f%n", subtotal);
        System.out.printf("Vat                      %.2f\n", vatRate);
        System.out.printf("Total                    %.2f\n", total);
        System.out.println("                         ------");
        System.out.println("Cash                     " + Pay);
        System.out.printf("Change                   %.2f\n", Cash);
        System.out.println();
        System.out.println("THANK YOU FOR PURCHASE!");

        input.close();
    }

    public static double subtotal(double Price1, double Price2, double Price3, double Price4) {

        return Price1 + Price2 + Price3 + Price4;
    }

    public static double vatRate(double subtotal, double taxRate) {

        return subtotal * (taxRate / 100);
    }

    public static double total(double subtotal, double vatRate) {

        return subtotal + vatRate;
    }

    public static double Cash(double pay, double total) {

        return pay - total;
    }
}
