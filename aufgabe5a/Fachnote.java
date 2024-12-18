package aufgabe5a;

//import aufgabe5.Note;
/**
 * Klasse Fachnote.
 * @version 1.0
 */
public class Fachnote {
    private final String fach;
    private final Note note;

    /**
     * Gibt das Fach zurueck.
     * @return  das Fach
     */
    public String fach() {
        return this.fach;
    }
    /**
     *  Gibt die Note zurueck.
     * @return die Note
     */
    public Note note() {
        return this.note;
    }

    /**
     * Konstruktor.
     * @param fach
     * @param note
     */
    public Fachnote(String fach, Note note) {
        if (fach == null || note == null || fach.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.fach = fach;
        this.note = note;
    }
}
