public class CharacterBattle {

	public void igrisDetails() {
		System.out.println("Character Details");
		System.out.println("Igris Weapons: \n1. Sword \n2. Dagger \n3. Long Sword");
	}

	public void hestiaDetails() {
		System.out.println("\nHestia Weapons: \n1. Dagger \n2. Bow \n3. Staff");
	}

	public static class Igris {
		int Sword;
		int Dagger;
		int LongSword;
		int totalDamage;

		public Igris() {
			Sword = (int)(Math.random() * 100) + 1;
			Dagger = (int)(Math.random() * 100) + 1;
			LongSword = (int)(Math.random() * 100) + 1;
			totalDamage = Sword + Dagger + LongSword;
			System.out.println("\nIgris Weapon Damage:");
			System.out.println("Sword Dmg: " + Sword);
			System.out.println("Dagger Dmg: " + Dagger);
			System.out.println("Long Sword Dmg: " + LongSword);
			System.out.println("Total Damage: " + totalDamage);
		}
	}

	public static class Hestia {
		int Dagger;
		int Bow;
		int Staff;
		int totalDamage;

		public Hestia() {
			Dagger = (int)(Math.random() * 100) + 1;
			Bow = (int)(Math.random() * 100) + 1;
			Staff = (int)(Math.random() * 100) + 1;
			totalDamage = Dagger + Bow + Staff;
			System.out.println("\nHestia Weapon Damage:");
			System.out.println("Dagger Dmg: " + Dagger);
			System.out.println("Bow Dmg: " + Bow);
			System.out.println("Staff Dmg: " + Staff);
			System.out.println("Total Damage: " + totalDamage);
		}
	}

	public static void main(String[] args) {
		CharacterBattle details = new CharacterBattle();
		details.igrisDetails();
		details.hestiaDetails();

		Igris igrisDamage = new Igris();
		Hestia hestiaDamage = new Hestia();

		if (igrisDamage.totalDamage > hestiaDamage.totalDamage) {
			System.out.println("\nIgris wins!");
		} else if (hestiaDamage.totalDamage > igrisDamage.totalDamage) {
			System.out.println("\nHestia wins!");
		} else {
			System.out.println("\nIt's a draw!");
		}
	}
}