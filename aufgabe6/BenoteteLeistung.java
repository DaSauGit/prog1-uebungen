package aufgabe6;

import aufgabe5a.Note;

/**
 * Die Klasse BenoteteLeistung erweitert die abstrakte Klasse Leistung.
 * Sie repräsentiert eine Leistung, die mit einer Note beurteilt wurde.
 * Die Note wird durch die Klasse Note dargestellt.
 */
public class BenoteteLeistung extends aufgabe6.Leistung {
    private final Note note;

    /**
     * Constructs a new BenoteteLeistung object, representing a
     * graded performance in a specific subject.
     *
     * @param f    the name of the subject; must be a permissible
     *             subject as determined by Faecher.istZulaessig.
     * @param note the grade for the performance, represented
     *             as a string (e.g., "1,0"). Must be in the
     *             set of acceptable grades.
     *             The grade will be converted to a Note object
     *             using Note.valueOf.
     * @throws IllegalArgumentException if the subject is not
     *                                  permissible or the grade
     *                                  string is invalid.
     */
    public BenoteteLeistung(String f, String note) {
        super(f);
        this.note = Note.valueOf(note);

    }

    @Override
    public boolean istBestanden() {
        return note.istBestanden();
    }

    @Override
    public boolean istBenotet() {
        return true;
    }

    @Override
    public String getNote() {
        return note.toString();
    }
}
