package aufgabe6;

/**
 * Die Klasse UnbenoteteLeistung stellt eine unbenotete Leistung dar, die
 * auf einem bestimmten Fach basiert und entweder als bestanden oder
 * nicht bestanden gekennzeichnet ist. Sie erweitert die abstrakte
 * Basisklasse Leistung.
 */
public class UnbenoteteLeistung extends aufgabe6.Leistung {

    private final boolean bestanden;

    /**
     * Konstruktor der Klasse UnbenoteteLeistung. Initialisiert eine unbenotete
     * Leistung mit einem Fachnamen und einem Status, der angibt, ob die
     * Leistung bestanden wurde.
     *
     * @param f der Name des Fachs; muss ein gültiger Fachname sein, wie durch
     *          {@link Faecher#istZulaessig(String)} bestimmt.
     * @param b ein boolescher Wert, der angibt, ob die Leistung bestanden ist
     *          (true für bestanden, false für nicht bestanden).
     * @throws IllegalArgumentException wenn der Fachname ungültig ist.
     */
    public UnbenoteteLeistung(String f, boolean b) {
        super(f);
        this.bestanden = b;
    }

    @Override
    public boolean istBestanden() {
        return bestanden;
    }

    @Override
    public boolean istBenotet() {
        return false;
    }

}
