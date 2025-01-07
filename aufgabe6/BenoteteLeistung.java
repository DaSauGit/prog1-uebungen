package aufgabe6;
import aufgabe5a.Note;

public class BenoteteLeistung extends aufgabe6.Leistung{
    private final Note note;

    public BenoteteLeistung(String f, String n) {
        Note note2 = Note.valueOf(n);
        super(f);
        this.note = note2;
    }

    @Override
    public boolean istBestanden() {
        throw new UnsupportedOperationException("Unimplemented method 'istBestanden'");
    }

    @Override
    public boolean istBenotet() {
        throw new UnsupportedOperationException("Unimplemented method 'istBenotet'");
    }
}
