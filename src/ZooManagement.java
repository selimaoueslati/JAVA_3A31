//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println( zooName + " contient " + nbrCages + " cages.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Donner le nom du zoo :");
        zooName = scanner.nextLine();

        System.out.println("Donner le nombre de cages :");
        nbrCages = scanner.nextInt();

        if (nbrCages > 0 && zooName.length() > 0) {
            System.out.println("Le zoo " + zooName + " contient " + nbrCages + " cages.");
        } else {
            System.out.println("Valeurs incorrectes");
        }
    }
}