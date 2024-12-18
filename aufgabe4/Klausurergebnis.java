// Klausurergebnis.java
package aufgabe4;
//import aufgabe4.schweiz.Noten;
import java.util.Locale;
import java.util.Scanner;
/**
 * Klausurergebnis erstellt eine Notenstatistik.
 * <p>
 * Das Programm liest Noten als Strings ein und bestimmt die beste und
 * die schlechteste Note, den Durchschnitt der Bestandenen sowie
 * die Durchfallquote in Prozent.
 * Das Programm ber&uuml;cksichtigt dabei nur die laut Noten.istZulaessig
 * erlaubten Noten. Andere Noten werden unter Ausgabe einer Warnung ignoriert.
 * Welche Noten besser und schlechter sind, welche als bestanden oder
 * durchgefallen gelten und wie die String-Darstellung der Noten aussieht,
 * wird mit Methoden der Klasse Noten bestimmt.
 * </p>
 * Das Programm gibt als Klausurergebnis folgende Werte aus:
 * <ul>
 * <li>die Anzahl der ber&uuml;cksichtigten Noten</li>
 * <li>die Anzahl der Bestandenen</li>
 * <li>die beste Note</li>
 * <li>die schlechteste Note</li>
 * <li>den Durchschnitt der Bestandenen</li>
 * <li>die Durchfallquote</li>
 * </ul>
 *
 * @author Daniel Sauer
 * @version 26.11.2024
 */
public final class Klausurergebnis {
    private Klausurergebnis() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMAN);

        int beruecksichtigt = 0;
        int bestanden = 0;
        double besteNote = Noten.SCHLECHTESTE;
        double schlechtesteNote = Noten.BESTE;
        double alleNotenBestanden = 0;

        System.out.println("Noten Ganze,Zehntel oder Ganze.Zehntel eingeben "
                           + "(Ende mit Strg-D/Strg-Z):");

        while (EINGABE.hasNext()) {
            String note = EINGABE.next();

            if (!Noten.istZulaessig(note)) {
                System.out.printf("Unzulaessige Note %s wird ignoriert!%n",
                                note);
                continue;
            }
            beruecksichtigt++;

            double noteDouble = Noten.toDouble(note);
            if (Noten.istBestanden(noteDouble)) {
                bestanden++;
                alleNotenBestanden += noteDouble;
            }

            besteNote = Noten.bessere(besteNote, noteDouble);
            schlechtesteNote = Noten.schlechtere(schlechtesteNote,
                                                noteDouble);

        }
        //final double hundert = 100.0;
        System.out.println();
        System.out.printf("Anzahl beruecksichtigter Noten: %d%n",
            beruecksichtigt);
        System.out.printf("Anzahl Bestandene: %d%n",
            bestanden);
        if (beruecksichtigt != 0) {
            System.out.printf("Beste Note: %.1f%n",
                besteNote);
            System.out.printf("Schlechteste Note: %.1f%n",
                schlechtesteNote);
            System.out.printf("Durchschnitt Bestandene: %.1f%n",
                alleNotenBestanden / bestanden);
            System.out.printf("Durchfallquote: %.1f%%%n",
                100.0 * (beruecksichtigt - bestanden) / beruecksichtigt);
        }

    }
}

