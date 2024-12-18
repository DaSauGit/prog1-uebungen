// Histogrammbonus2.java
package aufgabe2.bonus;

import java.util.Scanner;

/**
 * Histogramm liest ganze Zahlen zwischen 1 und 6 ein und
 * gibt deren H&auml;ufigkeitsverteilung als Histogramm aus.
 * @author Daniel Sauer
 * @version 29.10.24
 */
public final class Histogrammbonus2 {
    private Histogrammbonus2() { }

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
        int min = 100000000;
        

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
        for (int i = 0; i < zahlen.length; ++i) {
            if (zahlen[i] < min) {
                min = zahlen[i];
            }
        }
        // for (int i = 0; i < zahlen.length; ++i) {
        //     zahlen[i] = zahlen[i] - min;
        // }


        for (int j = 0; j < zahlen.length; ++j) {
            int max = zahlen[j];
            int n = max / 50 + 1;
            for (int i = 0; i < zahlen[j] / n - min; i++) {
                if (i % k1 == 4) {
                    System.out.print("§");
                } else {
                    System.out.printf("%d", j + 1);
                }
            }
            System.out.printf(" (%d)%n", zahlen[j]);
        }
    }
}