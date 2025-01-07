package aufgabe6;

public class UnbenoteteLeistung extends aufgabe6.Leistung{

    private final boolean bestanden;

    public UnbenoteteLeistung(String f, boolean b) {
        super(f);
        this.bestanden = b;
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
