//Einstieg.java
package einstieg;

import java.util.Scanner;

/**
 * Einstieg ist ein kleines Java-Programm.
 * Es verwendet die Klassen Scanner und System aus der Java-Bibliothek.
 * @author Daniel
 * @version ka wann das war
 */

public final class Einstieg {
    private Einstieg() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * Die Klassenmethode main ist der STartpunkt des Programms.
     * main verwendet die Methoden print und printf zum ausgeben von Text
     * sowie die Methoden next und nextInt zum einlesen von Text
     * und einer ganzen Zahl.
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {
        System.out.print("Vorname: ");
        String vorname = EINGABE.next();

        System.out.print("Anzahl geschriebener Java-Programme: ");
        int anzahl = EINGABE.nextInt();

        System.out.printf("%ss %d. Java_Programm funktioniert!%n",
                        vorname, anzahl + 1);
    }
}