package aufgabe6;
import aufgabe5a.Note;

public class BenoteteLeistung extends aufgabe6.Leistung{
    private final Note note;

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
}
