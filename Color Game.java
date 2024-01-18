import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		println("\n\t\t    WELCOME TO COLOR GAME");
		println("\t|-----------|------------|-----------|");
    // 11 "-"
		println("\t|    RED    |    WHITE   |    GREEN  |");
    // 11 "-"
		println("\t|-----------|------------|-----------|");
		println("\t|    BLUE   |    YELLOW  |    PINK   |");
    // 11 "-"
		println("\t|-----------|------------|-----------|");

		while (true) {

			print("\n\tChoose Color: ");
			String chosenColor = input.next().toLowerCase();

			if (isValidColor(chosenColor)) {

				print("\tDo you want to Draw? Y/N: ");
				char draw = Character.toLowerCase(input.next().charAt(0));

				if (draw != 'y') {
					println("\tThank You For Playing");
					System.exit(0);
				} else {
					int cube1 = (int)(Math.random() * 6) + 1;
					System.out.println("\tCube 1: " + getColorName(cube1));
					int cube2 = (int)(Math.random() * 6) + 1;
					System.out.println("\tCube 2: " + getColorName(cube2));
					int cube3 = (int)(Math.random() * 6) + 1;
					System.out.println("\tCube 3: " + getColorName(cube3));

					if (chosenColor.equals(getColorName(cube1)) || chosenColor.equals(getColorName(cube2)) || chosenColor.equals(getColorName(cube3))) {
						println("\tYou won");
					} else if ((chosenColor.equals(getColorName(cube1)) && chosenColor.equals(getColorName(cube2))) ||
							   (chosenColor.equals(getColorName(cube1)) && chosenColor.equals(getColorName(cube3))) ||
							   (chosenColor.equals(getColorName(cube2)) && chosenColor.equals(getColorName(cube3)))) {
						println("\tYou won x2");
					} else if (chosenColor.equals(getColorName(cube1)) && chosenColor.equals(getColorName(cube2)) && chosenColor.equals(getColorName(cube3))) {
						println("\tYou won x3");
					} else {
						println("\tYou Lose!");
					}
				}
			} else {
				println("\tPlease choose a valid color from the box");
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
			return "red";
		case 2:
			return "white";
		case 3:
			return "green";
		case 4:
			return "blue";
		case 5:
			return "yellow";
		case 6:
			return "pink";
		default:
			return "";
		}
	}

	public static void println(String words) {
		System.out.println(words);
	}

	public static void print(String words) {
		System.out.print(words);
	}
