package klausurvorbereitung;

public final class Noten {
    public static final double BESTE = (double) 1.0F;
    public static final double SCHLECHTESTE = (double) 5.0F;

    public Noten() {
    }

    public static boolean istZulaessig(String note) {
        if (note.length() != 3) {
            return false;
        } else {
            char c1 = note.charAt(0);
            char c2 = note.charAt(1);
            char c3 = note.charAt(2);
            if (c2 != '.' && c2 != ',') {
                return false;
            } else if (!Character.isDigit(c1) && !Character.isDigit(c3)) {
                return false;
            } else if ((c1 == '4' || c1 == '5') && c3 != '0') {
                return false;
            } else if (c1 != '1' && c1 != '2' && c1 != '3' && c1 != '4' && c1 != '5') {
                return false;
            } else if (c3 == '0') {
                return true;
            } else {
                return (c3 == '3' || c3 == '7') && c1 != '4' && c1 != '5';
            }
        }
    }

    public static double toDouble(String note) {
        if (istZulaessig(note)) {
            char var10000 = note.charAt(0);
            String notePunkt = var10000 + "." + note.charAt(2);
            double noteDouble = Double.parseDouble(notePunkt);
            return noteDouble;
        } else {
            throw new IllegalArgumentException(note + " Note ist nicht zulässig.");
        }
    }

    public static String toString(double note) {
        if ((double) 1.0F <= note && note <= (double) 5.0F) {
            String noteString = Double.toString(note);
            return noteString;
        } else {
            throw new IllegalArgumentException(note + " Note ist nicht zulässig.");
        }
    }

    public static boolean istBestanden(double note) {
        return note <= (double) 4.0F;
    }

    public static double bessere(double noteEins, double noteZwei) {
        return noteEins < noteZwei ? noteEins : noteZwei;
    }

    public static double schlechtere(double noteEins, double noteZwei) {
        return noteEins > noteZwei ? noteEins : noteZwei;
    }
}