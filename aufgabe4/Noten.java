//Noten.java
package aufgabe4;
/**
 * @author Daniel Sauer
 * @version 03.12.24
 */
public final class Noten {
    /**
     * Represents the highest possible grade in
     * the grading system.
     * This constant is used to compare grades
     * and determine the best grade.
     * It is part of the grading logic
     * encapsulated in the Noten class.
     */
    public static final double BESTE = 1.0;
    /**
     * Repräsentiert die schlechteste mögliche
     * Note im Notensystem.
     * Die Note wird als Konstante mit einem
     * festen Wert definiert.
     * Diese Konstante wird verwendet, um
     * Bewertungen und Vergleiche
     * zwischen Noten durchzuführen oder um
     * Standardwerte zu initialisieren.
     */
    public static final double SCHLECHTESTE = 5.0;

    /**
     * Überprüft, ob eine angegebenen Note
     * als gültig angesehen wird.
     *
     * @param note Die Note, die geprüft
     *             werden soll, im Format "X.Y"
     *             oder "X,Y",
     *             wobei X und Y Ziffern sind
     *             und bestimmten Bedingungen
     *             für eine
     *             gültige Note entsprechen.
     * @return true, wenn die Note gültig ist;
     * false, wenn die Note ungültig ist.
     */
    public static boolean istZulaessig(String note) {
        if (note.length() != 3) {
            return false;
        }
        char c1 = note.charAt(0);
        char c2 = note.charAt(1);
        char c3 = note.charAt(2);
        if (c2 != '.' && c2 != ',') {
            return false;
        } else if (!Character.isDigit(c1) && !Character.isDigit(c3)) {
            return false;
        } else if ((c1 == '4' || c1 == '5') && c3 != '0') {
            return false;
        } else if (c1 == '1' || c1 == '2' || c1 == '3'
                    || c1 == '4' || c1 == '5') {
            if (c3 == '0') {
                return true;
            } else if ((c3 == '3' || c3 == '7') && c1 != '4' && c1 != '5') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Converts a valid grade represented as
     * a string in the format "X.Y" or "X,Y"
     * into a double value. The method checks
     * if the input string represents a valid
     * grade format and throws an exception
     * if not.
     *
     * @param note the grade as a string, which
     *             should be in the format "X.Y"
     *             or "X,Y", where X and Y are
     *             digits adhering to the rules
     *             for valid grades.
     * @return the numeric representation of
     * the grade as a double.
     * @throws IllegalArgumentException if the
     * input grade is not valid.
     */
    public static double toDouble(String note) {
        if (istZulaessig(note)) {
            String notePunkt = note.charAt(0) + "." + note.charAt(2);
            double noteDouble = Double.parseDouble(notePunkt);
            return noteDouble;
        } else {
            throw new IllegalArgumentException(note
                                            + " Note ist nicht zulässig.");
        }
    }

    /**
     * Converts a numeric grade (as a double value)
     * to its string representation
     * if the grade is within the valid grade range
     * defined by the constants
     * BESTE and SCHLECHTESTE. If the grade is not
     * valid, an exception is thrown.
     *
     * @param note the numeric grade to be converted
     *             to a string representation.
     * @return the string representation of the
     * specified numeric grade.
     * @throws IllegalArgumentException if the grade
     * is not within the valid
     *range of grades.
     */
    public static String toString(double note) {
        if (BESTE <= note && note <= SCHLECHTESTE) {
            String noteString = Double.toString(note);
            return noteString;
        } else {
            throw new IllegalArgumentException(note
                                            + " Note ist nicht zulässig.");
        }
    }

    /**
     * Überprüft, ob eine Note als
     * bestanden betrachtet wird.
     * Eine Note wird als bestanden
     * angesehen, wenn sie kleiner oder
     * gleich 4.0 ist.
     *
     * @param note Die Note, die geprüft
     *             werden soll, im Format
     *             einer Dezimalzahl
     *             (z. B. 1.0, 2.3, 4.0).
     * @return true, wenn die Note bestanden
     * ist (note <= 4.0);
     *         false, wenn die Note nicht
     *         bestanden ist.
     */
    public static boolean istBestanden(double note) {
        if (note <= 4) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Determines the better (smaller)
     * of two grades.
     * A grade is considered better if its
     * value is numerically smaller.
     *
     * @param noteEins the first grade to compare
     * @param noteZwei the second grade to compare
     * @return the smaller of the two grades
     */
    public static double bessere(double noteEins, double noteZwei) {
        if (noteEins < noteZwei) {
            return noteEins;
        } else {
            return noteZwei;
        }
    }

    /**
     * Determines the worse (larger)
     * of two grades.
     * A grade is considered worse if
     * its value is numerically larger.
     *
     * @param noteEins the first grade
     *                 to compare
     * @param noteZwei the second grade
     *                 to compare
     * @return the larger of the two grades
     */
    public static double schlechtere(double noteEins, double noteZwei) {
        if (noteEins > noteZwei) {
            return noteEins;
        } else {
            return noteZwei;
        }
    }
}
