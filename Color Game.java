import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\t\t    WELCOME TO COLOR GAME");
		System.out.println("\t|-----------|------------|-----------|");
		System.out.println("\t|    RED    |    WHITE   |    GREEN  |");
		System.out.println("\t|-----------|------------|-----------|");
		System.out.println("\t|    BLUE   |    YELLOW  |    PINK   |");
		System.out.println("\t|-----------|------------|-----------|");

		while (true) {
			System.out.print("\n\tChoose Color: ");
			String chosenColor = input.next().toLowerCase();

			if (isValidColor(chosenColor)) {
				System.out.print("\tDo you want to Draw? Y/N: ");
				char draw = Character.toLowerCase(input.next().charAt(0));

				if (draw != 'y') {
					System.out.println("\tThank You For Playing");
					System.exit(0);
				} else {
					int cube1 = (int)(Math.random() * 6) + 1;
					System.out.println("\tCube 1: " + getColorName(cube1));
					int cube2 = (int)(Math.random() * 6) + 1;
					System.out.println("\tCube 2: " + getColorName(cube2));
					int cube3 = (int)(Math.random() * 6) + 1;
					System.out.println("\tCube 3: " + getColorName(cube3));

					if (chosenColor.equalsIgnoreCase(getColorName(cube1)) ||
							chosenColor.equalsIgnoreCase(getColorName(cube2)) ||
							chosenColor.equalsIgnoreCase(getColorName(cube3))) {
						System.out.println("\tResult: You won");
					} else if ((chosenColor.equalsIgnoreCase(getColorName(cube1)) && chosenColor.equalsIgnoreCase(getColorName(cube2))) ||
								(chosenColor.equalsIgnoreCase(getColorName(cube1)) && chosenColor.equalsIgnoreCase(getColorName(cube3))) ||
				            	(chosenColor.equalsIgnoreCase(getColorName(cube2)) && chosenColor.equalsIgnoreCase(getColorName(cube3)))) {
					System.out.println("\tResult: You won x2");
					} else if (chosenColor.equalsIgnoreCase(getColorName(cube1)) && chosenColor.equalsIgnoreCase(getColorName(cube2)) && chosenColor.equalsIgnoreCase(getColorName(cube3))) {
					System.out.println("\tResult: You won x3");
					} else {
						System.out.println("\tResult: You Lose!");
					}
				}
			} else {
				System.out.println("\tPlease choose a valid color from the box");
			}
		}
	}

	static boolean isValidColor(String color) {
		return color.equals("red") || color.equals("white") || color.equals("green") ||
			   color.equals("blue") || color.equals("yellow") || color.equals("pink");
	}

	static String getColorName(int number) {
		switch (number) {
		case 1:
			return "Red";
		case 2:
			return "White";
		case 3:
			return "Green";
		case 4:
			return "Blue";
		case 5:
			return "Yellow";
		case 6:
			return "Pink";
		default:
			return "";
		}
	}
}