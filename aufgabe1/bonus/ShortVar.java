// ShortVar.java

package aufgabe1.bonus;

import java.util.Scanner;

/**
 * ShortVar zeigt den Umgang mit Variablen vom Typ Short.
 * &Uuml;bungsaufgabe 1 zur Programmiertechnik 1.
 * @author Daniel Sauer
 * @version 22.10.24
 */
public final class ShortVar {
    private ShortVar() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        /* Konstanten min und max definieren */
        final short min = -32768;
        final short max = 32767;

        /* Eingabeaufforderung ausgeben */
        System.out.printf("Zwei ganze Zahlen zwischen %d und %d eingeben: ", min, max);
        short z1 = EINGABE.nextShort();
        short z2 = EINGABE.nextShort();

        /* zwei ganze Zahlen einlesen */

        /* die beiden Zahlen dezimal, okatal und hexadezimal ausgeben */
        System.out.printf("%d %d%n", z1, z2);
        System.out.printf("%d ist oktal %o und hexadezimal %x%n", z1, z1, z1);
        System.out.printf("%d ist oktal %o und hexadezimal %x%n", z2, z2, z2);

        /* alle zweistelligen arithmetischen Operatoren ausprobieren */
        System.out.printf("%d + %d = %d%n", z1, z2, z1 + z2);
        System.out.printf("%d - %d = %d%n", z1, z2, z1 - z2);
        System.out.printf("%d * %d = %d%n", z1, z2, z1 * z2);
        System.out.printf("%d / %d = %d%n", z1, z2, z1 / z2);
        System.out.printf("%d teilt mit rest %d = %d%n", z1, z2, z1 % z2);


        /* alle Vergleichsoperatoren ausprobieren */
        System.out.printf("%d == %d ist %b%n", z1, z2, z1 == z2);
        System.out.printf("%d != %d ist %b%n", z1, z2, z1 != z2);
        System.out.printf("%d < %d ist %b%n", z1, z2, z1 < z2);
        System.out.printf("%d <= %d ist %b%n", z1, z2, z1 <= z2);
        System.out.printf("%d > %d ist %b%n", z1, z2, z1 > z2);
        System.out.printf("%d >= %d ist %b%n", z1, z2, z1 >= z2);

    }
}