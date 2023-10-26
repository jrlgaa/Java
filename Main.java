import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
              
        String Foods[] = {"Chicken adobo ", "Pork Sinigang ", "Kare-Kare"};
        String Ingredients[] = {"Pineapple Juice ", "Radish ", "Peanuts"};
        String Location[] = {"Batangas ", "Manila ", "Rizal"};
        
        int Select;
        System.out.println("Select Food \n0: Chicken adobo \n1: Pork sinigang \n2: Kare-kere ");
        Select = input.nextInt();
        System.out.println("Select Ingredients \n0: Pineapple Juice \n1: Radish \n2: Peanuts ");
        Select = input.nextInt();
        System.out.println("Select Location \n0: Batangas \n1: Manila \n2: Rizal ");
        Select = input.nextInt();
        System.out.println();
        System.out.println("I have a " + Foods[Select] + " with ingredient of " + Ingredients[Select] + " and made in " + Location[Select] + ".");
    }
}