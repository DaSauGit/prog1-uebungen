// IntVar.java

package aufgabe1;

import java.util.Scanner;

/**
 * IntVar zeigt den Umgang mit Variablen vom Typ int.
 * &Uuml;bungsaufgabe 1 zur Programmiertechnik 1.
 * @author Daniel Sauer
 * @version 15.10.24
 */
public final class IntVar {
    private IntVar() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        /* Konstanten min und max definieren */
        final int min = -2147483648;
        final int max = 2147483647;

        /* Eingabeaufforderung ausgeben */
        System.out.printf("Zwei ganze Zahlen zwischen %d und %d eingeben: ",
            min, max);
        int z1 = 0;
        int z2 = 0;
        if (EINGABE.hasNextInt()) {
            z1 = EINGABE.nextInt();
            if (EINGABE.hasNextInt()) {
                z2 = EINGABE.nextInt();
                /* zwei ganze Zahlen einlesen */

                /* die beiden Zahlen dezimal, okatal und hexadezimal ausgeben */
                System.out.printf("%d %d%n", z1, z2);
                System.out.printf("%d ist oktal %o und hexadezimal %x%n",
                                z1, z1, z1);
                System.out.printf("%d ist oktal %o und hexadezimal %x%n",
                                z2, z2, z2);
                /* alle zweistelligen arithmetischen Operatoren ausprobieren */
                System.out.printf("%d + %d = %d%n", z1, z2, z1 + z2);
                System.out.printf("%d - %d = %d%n", z1, z2, z1 - z2);
                System.out.printf("%d * %d = %d%n", z1, z2, z1 * z2);
                System.out.printf("%d / %d = %d%n", z1, z2, z1 / z2);
                System.out.printf("%d teilt mit rest %d = %d%n",
                                z1, z2, z1 % z2);
                /* alle Vergleichsoperatoren ausprobieren */
                System.out.printf("%d == %d ist %b%n", z1, z2, z1 == z2);
                System.out.printf("%d != %d ist %b%n", z1, z2, z1 != z2);
                System.out.printf("%d < %d ist %b%n", z1, z2, z1 < z2);
                System.out.printf("%d <= %d ist %b%n", z1, z2, z1 <= z2);
                System.out.printf("%d > %d ist %b%n", z1, z2, z1 > z2);
                System.out.printf("%d >= %d ist %b%n", z1, z2, z1 >= z2);
            } else {
                System.out.println("gib bitte 2 Zahlen in "
                                + "dem angegebenen Bereich ein!");
            }
        } else {
            System.out.println("gib bitte 2 Zahlen in "
                            + "dem angegebenen Bereich ein!");
        }
    }
}