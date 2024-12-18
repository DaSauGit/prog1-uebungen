// ByteVar.java

package aufgabe1.bonus;

import java.util.Scanner;

/**
 * ByteVar zeigt den Umgang mit Variablen vom Typ Byte.
 * &Uuml;bungsaufgabe 1 zur Programmiertechnik 1.
 * @author Daniel Sauer
 * @version 22.10.24
 */
public final class ByteVar {
    private ByteVar() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        /* Konstanten min und max definieren */
        final byte min = -128;
        final byte max = 127;

        /* Eingabeaufforderung ausgeben */
        System.out.printf("Zwei ganze Zahlen zwischen %d und %d eingeben: ", min, max);
        byte z1 = EINGABE.nextByte();
        byte z2 = EINGABE.nextByte();

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