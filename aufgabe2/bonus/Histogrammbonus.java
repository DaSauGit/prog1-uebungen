// Histogrammbonus.java
package aufgabe2.bonus;

import java.util.Scanner;

/**
 * Histogramm liest ganze Zahlen zwischen 1 und 6 ein und
 * gibt deren H&auml;ufigkeitsverteilung als Histogramm aus.
 * @author Daniel Sauer
 * @version 29.10.24
 */
public final class Histogrammbonus {
    private Histogrammbonus() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {

        //---------------------------------------------------- Zahlen einlesen
        int[] zahlen = {0, 0, 0, 0, 0, 0,};

        System.out.println("Ganze Zahlen zwischen 1 und 6 eingeben "
                    + "(Ende mit Strg-D/Strg-Z):");

        while (EINGABE.hasNextInt()) {

            int number = EINGABE.nextInt();
            if (number > 6) {
                System.out.printf("%nFalsche Eingabe wird ignoriert: %d%n",
                                number);
            } else {
                ++zahlen[number - 1];
            }

        }
     

        for (int j = 0; j < zahlen.length; ++j) {
            int max = zahlen[j];
            int n = max / 50 + 1;
            for (int i = 0; i < zahlen[j] / n; i++) {
                if (i % 5 == 4) {
                    System.out.print("§");
                } else {
                    System.out.printf("%d", j + 1);
                }
            }
            System.out.printf(" (%d)%n", zahlen[j]);
        }
    }
}

