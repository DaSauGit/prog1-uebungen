// Histogramm.java
package aufgabe2;

import java.util.Scanner;

/**
 * Histogramm liest ganze Zahlen zwischen 1 und 6 ein und
 * gibt deren H&auml;ufigkeitsverteilung als Histogramm aus.
 * @author Daniel Sauer
 * @version 29.10.24
 */
public final class Histogramm {
    private Histogramm() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {

        //---------------------------------------------------- Zahlen einlesen
        int[] zahlen = {0, 0, 0, 0, 0, 0};
        final int k1 = 5;
        final int k2 = 6;

        System.out.println("Ganze Zahlen zwischen 1 und 6 eingeben "
                    + "(Ende mit Strg-D/Strg-Z):");

        while (EINGABE.hasNextInt()) {

            int number = EINGABE.nextInt();
            if (number > k2) {
                System.out.printf("%nFalsche Eingabe wird ignoriert: %d%n",
                                number);
            } else {
                ++zahlen[number - 1];
            }
        }
        // int[] zahlen = {einsen, zweien, dreien, vieren, fuenfen, sechsen};

        for (int j = 1; j < zahlen.length + 1; ++j) {
            for (int i = 1; i < zahlen[j - 1] + 1; i++) {
                if (i % k1 == 0) {
                    System.out.print("§");
                } else {
                    System.out.printf("%d", j);
                }
            }
            System.out.printf(" (%d)%n", zahlen[j - 1]);
        }
    }
}