import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
              
        String Foods[] = {"Chicken adobo ", "Pork Sinigang ", "Kare-Kare"};
        String Ingredients[] = {"Pineapple Juice ", "Radish ", "Peanuts"};
        String Location[] = {"Batangas ", "Manila ", "Rizal"};

        System.out.println("Select Food \n0: Chicken adobo \n1: Pork sinigang \n2: Kare-kere ");
        int Foods0 = input.nextInt();
        System.out.println("Select Ingredients \n0: Pineapple Juice \n1: Radish \n2: Peanuts ");
        int Ingredients1 = input.nextInt();
        System.out.println("Select Location \n0: Batangas \n1: Manila \n2: Rizal ");
        int Location2 = input.nextInt();
        System.out.println();
        System.out.println("I have a " + Foods[Foods0] + " with ingredient of " + Ingredients[ingredients1] + " and made in " + Location[Location2] + ".");
    }
}
