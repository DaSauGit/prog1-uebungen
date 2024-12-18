//Noten.java
package aufgabe4;
/**
 * @author Daniel Sauer
 * @version 03.12.24
 */
public final class Noten {
    /**
     * Beste Note.
     */
    public static final double BESTE = 1.0;
    /**
     * Schlechteste Note.
     */
    public static final double SCHLECHTESTE = 5.0;

    /**
     * Überprüft, ob die Note zulässig ist.
     * @param note
     * @return returned true, wenn die Note zulässig ist, sonst false
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
     *Ändert die note von String in Double.
     * @param note
     * @return Die Note als Double
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
     * Ändert die note von Double in String.
     * @param note
     * @return Die Note als String
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
     * Überprüft, ob die Note als bestanden gilt.
     * @param note
     * @return true wenn die Note als bestanden gilt, sonst false
     */
    public static boolean istBestanden(double note) {
        if (note <= 4) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Überprüft, welche Note besser ist.
     * @param noteEins
     * @param noteZwei
     * @return die bessere Note wird returned
     */
    public static double bessere(double noteEins, double noteZwei) {
        if (noteEins < noteZwei) {
            return noteEins;
        } else {
            return noteZwei;
        }
    }

    /**
     * Überprüft, welche Note schlechter ist.
     * @param noteEins
     * @param noteZwei
     * @return die schlechtere Note wird returned.
     */
    public static double schlechtere(double noteEins, double noteZwei) {
        if (noteEins > noteZwei) {
            return noteEins;
        } else {
            return noteZwei;
        }
    }
}
