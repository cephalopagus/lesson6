// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Weapon weapon1 = new Weapon(WeaponType.RIFLE, "Rifle of Malenia");
        Weapon weapon2 = new Weapon(WeaponType.BOW, "Magical Bow 99 lvl");
        Weapon weapon3 = new Weapon(WeaponType.SWORD, "Senbonsakura");

        Boss boss1 = new Boss("Kuchiki Byakuya", "Shinigami", 84,125, false, weapon3);

        System.out.println("BOSSES\n" +
                "======================");

        System.out.println(boss1.printInfo());

        Skeleton skeleton1 = new Skeleton("Leoric", "Undead", 423, 230, true, weapon2, 170);
        Skeleton skeleton2 = new Skeleton("Skeleton", "Undead", 70, 14, false, weapon2, 540);

        System.out.println("======================\n" +
                "\nSKELETONS\n" +
                "======================");

        System.out.println(skeleton1.printInfo());

        System.out.println("=====================");

        System.out.println(skeleton2.printInfo());
    }
}