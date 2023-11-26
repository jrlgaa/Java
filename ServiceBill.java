package main;

import java.util.Scanner;

public class ServiceBill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int i = 1;
		int User = 0;
		int minutesUsed = 0;
		int dayMinutesUsed = 0;
		int nightMinutesUsed = 0;
		double billAmount = 0;
		

		do {
			System.out.print("\n"+ ++User + ": Enter account number: ");
			int accountNumber = input.nextInt();
			System.out.println("\nSelect Service.");
			System.out.println("R for Regular ");
			System.out.println("P for Premium ");
			System.out.print("Input Here: ");
			char service = input.next().charAt(0);

			if (service == 'R' || service == 'r') {
				System.out.print("\nEnter Minutes Used: ");
				minutesUsed = input.nextInt();

				if (minutesUsed <= 50) {
					billAmount = 50;
				} else {
					billAmount = 50 + (minutesUsed - 50) * 5.0;
				}
			} else if (service == 'P' || service == 'p') {
				System.out.print("\nEnter Minutes During day (6am to 6pm): ");
				dayMinutesUsed = input.nextInt();
				System.out.print("Enter Minutes During night (6pm to 6am): ");
				nightMinutesUsed = input.nextInt();

				if (dayMinutesUsed <= 75) {
					billAmount = 50 + (nightMinutesUsed * 5.0);
				} else {
					billAmount = 50 + (dayMinutesUsed - 75) * 5.0 + nightMinutesUsed * 5.0;
				}
			} else {
				System.out.println("Invalid input. Please Enter R or P.");
				continue;
			}

			System.out.println("\nAccount Number: " + accountNumber);
			System.out.println("Service Type: " + (service == 'R' || service == 'r' ? "Regular" : "Premium"));

			if (service == 'R' || service == 'r') {
				System.out.println("Minutes Used: " + minutesUsed);
			} else {
				System.out.println("Day Minutes Used: " + dayMinutesUsed);
				System.out.println("Night Minutes Used: " + nightMinutesUsed);
			}

			System.out.println("Amount Due: Php" + billAmount);
			
			i++;
			
		} while (i <= 10);
		System.out.println("\nLimit Reached.");
		
		input.close();
	}
}