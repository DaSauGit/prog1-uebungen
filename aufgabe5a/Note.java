package aufgabe5a;

/**
 * Klasse Note.
 * @version 1.0
 */
public final class Note {
    private  int note = 0;

    /**
     * Konstruktor.
     * @param note
     */
    private Note(int note) {
        this.note = note;
    }

    /**
     * Konstanten BESTE und SCHLECHTESTE.
     */
    public static final Note BESTE = new Note(10);
    /**
     * Konstanten BESTE und SCHLECHTESTE.
     */
    public static final Note SCHLECHTESTE = new Note(50);

    /**
     * Methode valueOf.
     * @param newnote
     * @return note
     */
    public static Note valueOf(int newnote) {

        switch (newnote) {
        case 10, 13, 17, 20, 23, 27, 30, 33, 37, 40, 50:
            Note note = new Note(newnote);
            return note;
        default:
            throw new IllegalArgumentException("unzulässige Note "
                                            + newnote);
        }
    }

    /**
     * Methode valueOf.
     * @param newNote
     * @return note
     */
    public static Note  valueOf(String newNote) {
        switch (newNote) {
        case "1,0", "1,3", "1,7", "2,0", "2,3",
            "2,7", "3,0", "3,3", "3,7", "4,0", "5,0":
            String noteString = "" + newNote.charAt(0) + newNote.charAt(2);
            int noteint = Integer.parseInt(noteString);
            Note note = new Note(noteint);
            return note;
        default:
            throw new IllegalArgumentException("unzulässige Note " + newNote);
        }
    }


    @Override
    public String toString() {
        int ganzeZahl = this.note / 10;
        int nachkomma = this.note % 10;
        return ganzeZahl + "," + nachkomma;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Note) {
            Note that = (Note) o;
            return note == that.note;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return this.note;
    }

    /**
     * Methode intValue.
     * @return note
     */
    public int intValue() {
        return this.note;
    }

    /**
     * Methode istBestanden.
     * @return note
     */
    public boolean istBestanden() {
        if (note <= 40) {
            return true;
        }
        return false;
    }

}
