package aufgabe5a;
// Notenspiegel.java

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Notenspiegel liest die Namen von F&auml;chern mit den zugeh&ouml;rigen Noten
 * in eine verkettete Liste ein und gibt dann einen Notenspiegel aus.
 * @author Daniel Sauer
 * @version 17.12.24
 */
public final class Notenspiegel {
    private Notenspiegel() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        FachnotenListe liste = new FachnotenListe(); // leere Liste
        int laengstesFach = 0;

        //--------------------------------------------- Notenspiegel einlesen
        System.err.printf(
            "Faecher mit Noten zwischen %d und %d eingeben "
            + "(Ende mit Strg-D/Strg-Z):%n",
            Note.BESTE.intValue(), Note.SCHLECHTESTE.intValue());

        while (EINGABE.hasNext()) {
            try {
                //------------------------------------ Fach und Note einlesen

                //--------------------- neue Fachnote in Notenliste eintragen
                String fach = EINGABE.next();
                if (fach.length() >= laengstesFach) {
                    laengstesFach = fach.length();
                }
                Note note;
                if (EINGABE.hasNextInt()) {
                    int noteint = EINGABE.nextInt();
                    note = Note.valueOf(noteint);
                } else {
                    String noteString = EINGABE.next();
                    note = Note.valueOf(noteString);
                }

                Fachnote fachnote = new Fachnote(fach, note);
                liste.insert(fachnote);

            } catch (IllegalArgumentException x) {
                System.err.printf("Eingabefehler: %s%n", x.getMessage());
                continue;
            } catch (NoSuchElementException x) {
                System.err.println("Fach ohne Note ignoriert!");
                break;
            }
        }

        //--------------------------------------------- Notenspiegel ausgeben

        FachnotenListe.Iterator superIterator = liste.new Iterator();
        System.out.println("NOTENSPIEGEL:");
        final int vier = 4;

        while (superIterator.hasNext()) {
            Fachnote fachnote = superIterator.next();
            String fach = fachnote.fach();
            Note note = fachnote.note();
            while (fach.length() < laengstesFach + vier) {
                fach = fach + " ";
            }
            System.out.print(fach);
            System.out.print(note + "    ");
            if (note.istBestanden()) {
                if (note.equals(Note.BESTE)) {
                    System.out.println("mit Bestnote bestanden");
                } else {
                    System.out.println("bestanden");
                }
            } else {
                System.out.println("nicht bestanden");
            }
        }
    } // main
}

